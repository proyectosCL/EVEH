/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Database.Conexion;
import Modelo.Correo;
import Modelo.Persona;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author pcbla
 */
public class Administrar_Correo {

    Correo c = new Correo();

    public void enviarCorreo() {

        ArrayList<Persona> listaCorreos = listarCorreos();
        int num = listaCorreos.size();
        for (int i = 0; i < num; i++) {

            c.setPass("ebsphbmzjuvjferm");
            c.setUsuario("soporte.eveh@gmail.com");
            c.setAsunto("Aeronaves en mantencion");
            c.setMensaje("Estimado piloto, se adjunta listado de aeronaves en mantenimiento.");
            c.setDestino(listaCorreos.get(i).getCorreo());
            c.setNombreArchivo("prueba.pdf");
            c.setRutaArchivo("prueba.pdf");
            enviarCorreo(c);
        }

        if (enviarCorreo(c)) {
            JOptionPane.showMessageDialog(null, "Envio correcto");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public ArrayList<Persona> listarCorreos() {
        ArrayList listaCorreos = new ArrayList();
        Persona persona;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select PERSONAS.CORREO from PERSONAS inner join pilotos on personas.ID = pilotos.PERSONAS_ID where pilotos.ID IN (select PILOTOS_ID from LICENCIAS) and PERSONAS.CORREO IS NOT NULL");

            while (rs.next()) {
                persona = new Persona();
                persona.setCorreo(rs.getString("correo"));
                listaCorreos.add(persona);
            }
        } catch (Exception e) {
        }
        return listaCorreos;
    }

    public boolean enviarCorreo(Correo c) {
        try {

            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", c.getUsuario());
            p.setProperty("mail.smtp.auth", "true");

            Session s = Session.getDefaultInstance(p, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(c.getMensaje());
            BodyPart adjunto = new MimeBodyPart();

            if (!c.getRutaArchivo().equals("")) {
                adjunto.setDataHandler(new DataHandler(new FileDataSource(c.getRutaArchivo())));
                adjunto.setFileName(c.getNombreArchivo());
            }
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);

            if (!c.getRutaArchivo().equals("")) {
                m.addBodyPart(adjunto);
            }

            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(c.getUsuario()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getDestino()));
            mensaje.setSubject(c.getAsunto());
            mensaje.setContent(m);

            Transport t = s.getTransport("smtp");
            t.connect(c.getUsuario(), c.getPass());
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;

        } catch (Exception e) {

            System.out.println("Error " + e);
            return false;
        }

    }

}
