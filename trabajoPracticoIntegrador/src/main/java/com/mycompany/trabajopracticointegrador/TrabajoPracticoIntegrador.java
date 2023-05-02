/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopracticointegrador;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javier
 */
public class TrabajoPracticoIntegrador {

    public static void main(String[] args) {
        
        
        Collection<Partido> partidos=new ArrayList<Partido>();
        Path pathResultados=Paths.get(args[0]);  //Leer el primer archivo
        List<String> lineasResultados=null;
        try {
            lineasResultados = Files.readAllLines(pathResultados);
        } catch (IOException ex) {
            System.out.println("No se puede leer el archivo");
            System.exit(1);
        }
        boolean primera=true;
        for (String linea:lineasResultados ){
            if(primera){
                primera=false;
            } else{
                
              String[] campos=  linea.split(",");
              Equipo equipo1=new Equipo(campos[0]);
              Equipo equipo2=new Equipo(campos[3]);
                            
              Partido partido=new Partido(equipo1, equipo2);
              partido.setGolesEquipo1(Integer.parseInt(campos[1]));
              partido.setGolesEquipo2(Integer.parseInt(campos[2]));
              partido.setIdPartido(Integer.parseInt(campos[4]));
              partidos.add(partido);
              
            }
            
        }
        
        int puntos=0;
        
        Path pathPronostico=Paths.get(args[1]);  //Leer el primer archivo
        List<String> lineasPronostico=null;
        
        try {
            lineasPronostico=Files.readAllLines(pathPronostico);
            
        } catch (IOException ex) {
            System.out.println("No se pudo leer el archivo de pronosticos");
            System.out.println(ex.getMessage());
        }
        
        primera=true;
        for(String lineaPronostico:lineasPronostico){
            if(primera){
                primera=false;
            } else {
                System.out.println(lineaPronostico);
                String[] campos=lineaPronostico.split(",");
                Equipo equipo1=new Equipo(campos[0]);
                Equipo equipo2=new Equipo(campos[4]);
                Partido partido=null;
                
                for(Partido partidoColeccion:partidos){
                   if(partidoColeccion.getIdPartido()==Integer.parseInt(campos[5])){
                      partido=partidoColeccion; 
                   }
                    
                    /*if(partidoColeccion.getEquipo1().getNombre().equals(equipo1.getNombre())
                            && partidoColeccion.getEquipo2().getNombre().equals(equipo2.getNombre())){
                        partido=partidoColeccion;
                    }*/
                }
                Equipo equipo=null;
                ResultadoEnum resultado=null;
                 
                if("X".equals(campos[1])){
                    equipo=equipo1;    
                    resultado=ResultadoEnum.GANADOR;
                    }
                if("X".equals(campos[2])){
                    equipo=equipo1;
                    resultado=ResultadoEnum.EMPATE;
                    }
                if("X".equals(campos[3])){
                    equipo=equipo1;
                    resultado=ResultadoEnum.PERDEDOR;
                    }
                
                Pronostico pronostico=new Pronostico(partido, equipo, resultado);
                 puntos =puntos+ pronostico.puntos();
            }
        }
        System.out.println("Los puntos obtenidos son"+" "+puntos);
    }
}
