package br.edu.tds.ecommerce;

import com.cloudinary.Cloudinary;
import java.util.HashMap;
import java.util.Map;


public class CloudinaryConfig {

    private static Cloudinary cloudinary;

    public static Cloudinary getCloudinary() {

        if (cloudinary == null) {

            Map<String, String> config =
                    new HashMap<>();

            config.put("cloud_name", "ddcpqtkae");
            config.put("api_key", "435159391975375");
            config.put("api_secret", "e5qEkMe0AdKs2bH8xfD2v5a7lCQ");

            cloudinary =
                    new Cloudinary(config);
        }

        return cloudinary;
    }
}