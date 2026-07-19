import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
       // throw new UnsupportedOperationException("Please implement the isEmpty() method");
     if  ( languages.isEmpty())
      return true;
        else
      return false;        
    }

    public void addLanguage(String language) {
       // throw new UnsupportedOperationException("Please implement the addLanguage() method");

      languages.add(language);
        
        
    }

    public void removeLanguage(String language) {
      //  throw new UnsupportedOperationException("Please implement the removeLanguage() method");

        languages.remove(language);
        
    }

    public String firstLanguage() {
      //  throw new UnsupportedOperationException("Please implement the firstLanguage() method");

        String lang = languages.get(0);
        return lang;

            
    }

    public int count() {
       // throw new UnsupportedOperationException("Please implement the count() method");

       int size = languages.size();
        return size;
        
    }

    public boolean containsLanguage(String language) {
       // throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    
        if( languages.contains(language))
            return true;
        else
            return false;
    }

    public boolean isExciting() {
        //throw new UnsupportedOperationException("Please implement the isExciting() method");
        
        return languages.contains("Java") || languages.contains("Kotlin");
        
    }
}
