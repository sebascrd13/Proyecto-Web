
package com.proyectofinal.service;


import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, 
            String carpeta, 
            Long id);
    
    final String BucketName="dautos-f5c2e.appspot.com";
    
    //Esta es la ruta base de estre proyecto en el Storage
    final String rutaSuperiorStorage="dautos";
    
    //Ubicaciòn del archivo de configuraciòn Json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="dautos-f5c2e-firebase-adminsdk-9gs5o-2b4fbd36a5";
    
}
