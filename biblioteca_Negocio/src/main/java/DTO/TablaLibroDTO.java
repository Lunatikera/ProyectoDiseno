/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class TablaLibroDTO {

    private String ISBNDTO;
    private String tituloDTO;
    private String autorDTO;
    private String editorialDTO;
    private String generoDTO;
    private Calendar fechaDTO;

    public TablaLibroDTO() {
    }

    public String getISBNDTO() {
        return ISBNDTO;
    }

    public void setISBNDTO(String ISBNDTO) {
        this.ISBNDTO = ISBNDTO;
    }

    public String getTituloDTO() {
        return tituloDTO;
    }

    public void setTituloDTO(String tituloDTO) {
        this.tituloDTO = tituloDTO;
    }

    public String getAutorDTO() {
        return autorDTO;
    }

    public void setAutorDTO(String autorDTO) {
        this.autorDTO = autorDTO;
    }

    public String getEditorialDTO() {
        return editorialDTO;
    }

    public void setEditorialDTO(String editorialDTO) {
        this.editorialDTO = editorialDTO;
    }

    public String getGeneroDTO() {
        return generoDTO;
    }

    public void setGeneroDTO(String generoDTO) {
        this.generoDTO = generoDTO;
    }

    public Calendar getFechaDTO() {
        return fechaDTO;
    }

    public void setFechaDTO(Calendar fechaDTO) {
        this.fechaDTO = fechaDTO;
    }
    
    

}
