
package com.proyectofinal.service;


import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, 
            String carpeta, 
            Long id);
    
    final String BucketName="";
    
    //Esta es la ruta base de estre proyecto en el Storage
    final String rutaSuperiorStorage="";
    
    //Ubicaciòn del archivo de configuraciòn Json
    final String rutaJsonFile="";
    
    final String archivoJsonFile="";
    
}
