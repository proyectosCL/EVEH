/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jordans
 */
public class Detalle_Mantenimiento extends Mantenimientos {
    private int id_mante;
    private int id_compo;
    private int id_planes;
    private String tareas_seleccionadas;
    private String estado;
    private String matricula;

    public Detalle_Mantenimiento() {
    }

    public Detalle_Mantenimiento(int id_mante, int id_compo, int id_planes, String tareas_seleccionadas, String estado) {
        this.id_mante = id_mante;
        this.id_compo = id_compo;
        this.id_planes = id_planes;
        this.tareas_seleccionadas = tareas_seleccionadas;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_mante() {
        return id_mante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setId_mante(int id_mante) {
        this.id_mante = id_mante;
    }

    public int getId_compo() {
        return id_compo;
    }

    public void setId_compo(int id_compo) {
        this.id_compo = id_compo;
    }

    public int getId_planes() {
        return id_planes;
    }

    public void setId_planes(int id_planes) {
        this.id_planes = id_planes;
    }

    public String getTareas_seleccionadas() {
        return tareas_seleccionadas;
    }

    public void setTareas_seleccionadas(String tareas_seleccionadas) {
        this.tareas_seleccionadas = tareas_seleccionadas;
    }
    
    
}
