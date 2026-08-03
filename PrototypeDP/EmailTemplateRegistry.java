package PrototypeDP;

import java.util.Map;
import java.util.HashMap;

public class EmailTemplateRegistry {

    public static Map<String,EmailTemplate> templates = new HashMap<>();

    static {
        templates.put("welcome",new WelcomeEmail());
    }

    public static EmailTemplate getTemplate(String type) {
        return templates.get(type).clone();
    }

}
