/**
 *
 * @author Kap
 */
public class MapProcessing {

    public static void main(String[] args) {
        String objInput = "C:\\OBJTesting\\Desktop.obj";
        String objOutput = "C:\\OBJTesting\\BarProcessed.obj";
        
        ObjUtilities.createObjFromPoints(objOutput, 
                ObjUtilities.PointsInOBJ(
                        objInput, 
                        ObjUtilities.minZValue(objInput), 
                        ObjUtilities.maxZValue(objInput)));
    }
    
}
