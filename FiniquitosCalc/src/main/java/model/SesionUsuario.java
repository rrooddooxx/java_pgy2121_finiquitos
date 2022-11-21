/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sebastiankravetz
 */
public class SesionUsuario {
    
    boolean sesionValida;
    String mensajeError;
    Usuario usuarioLogueado;

    public SesionUsuario() {
    }

    public SesionUsuario(boolean sesionValida, String mensajeError, Usuario usuarioLogueado) {
        this.sesionValida = sesionValida;
        this.mensajeError = mensajeError;
        this.usuarioLogueado = usuarioLogueado;
    }

    public boolean isSesionValida() {
        return sesionValida;
    }

    public void setSesionValida(boolean sesionValida) {
        this.sesionValida = sesionValida;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SesionUsuario{");
        sb.append("sesionValida=").append(sesionValida);
        sb.append(", mensajeError=").append(mensajeError);
        sb.append(", usuarioLogueado=").append(usuarioLogueado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
