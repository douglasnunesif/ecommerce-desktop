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

            config.put("cloud_name", "");
            config.put("api_key", "");
            config.put("api_secret", "");

            cloudinary =
                    new Cloudinary(config);
        }

        return cloudinary;
    }
}
