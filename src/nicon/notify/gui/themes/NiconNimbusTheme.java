/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicon.notify.gui.themes;

/**
 *
 * @author frederick
 */
public class NiconNimbusTheme extends NiconTheme{
    
    private final String bakcgroundPanel;
    private final String titleForeground;
    private final String messageForeground;    
    private final String titleWarningForeground;
    private final String titleErrorForeground;
    private final String titleOKForeground;
    
    private static NiconNimbusTheme instance;
    
    private NiconNimbusTheme(){
        this.bakcgroundPanel = "232323";
        this.titleForeground = "ecf0f1";
        this.messageForeground = "ecf0f1";
        this.titleWarningForeground = "f39c12";
        this.titleErrorForeground = "e74c3c";
        this.titleOKForeground = "3498db";
    }
    
    /**
     * Retorna el color de fondo del panel para la notificacion
     * @return 
     */
    @Override
    public String getBakcgroundPanel() {
        return bakcgroundPanel;
    }
    
    /**
     * Retorna el color de fuente del titulo
     * @return 
     */
    @Override
    public String getTitleForeground() {
        return titleForeground;
    }
    
    /**
     * Retorna color de fuente del cuerpo de mensaje
     * @return 
     */
    @Override
    public String getMessageForeground() {
        return messageForeground;
    }
    
    /**
     * Retorna color de fuente de titulo para mensajes de advertencia
     * @return 
     */
    @Override
    public String getTitleWarningForeground() {
        return titleWarningForeground;
    }
    
    /**
     * Retorna el color de fuente de titulo para mensajes de Error
     * @return 
     */
    @Override
    public String getTitleErrorForeground() {
        return titleErrorForeground;
    }
    
    /**
     * Retorna el color de fuente de titulo para mensajes de exito
     * @return 
     */
    @Override
    public String getTitleOKForeground() {
        return titleOKForeground;
    }
    
    /**
     * Retorna una instancia de objeto del tema
     * @return 
     */
    public static NiconNimbusTheme getInstance(){
        if(instance==null){
            instance=new NiconNimbusTheme();
        }
        return instance;
    }   
    
}