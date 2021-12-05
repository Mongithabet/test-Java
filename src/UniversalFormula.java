import java.io.File;

public class UniversalFormula
{
static String locateUniverseFormula(){
    String formulaPath="/tmp/documents/";
    File f = new File(formulaPath);
    if (f.exists() || !f.isDirectory()){
        return formulaPath;
    }else{
        return null;
    }
}




    public static void main(String[] args)
    {
        System.out.println("In this exemple, the path is:");
locateUniverseFormula();

    }
}
