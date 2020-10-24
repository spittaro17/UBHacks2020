package Linear;
import Linear.Vector;

import java.util.ArrayList;

public class Matrix {
    public ArrayList<Vector> matrix;
    boolean orientation = false;

    public Matrix(ArrayList<Vector> input){
        matrix = input;
    }

    public Matrix add(Matrix a, Matrix b){
        if((a.matrix.size() != b.matrix.size()) && (a.matrix.get(0).vector.size() != b.matrix.get(0).vector.size())){
            return null;
        }
        ArrayList<Vector> ret = new ArrayList<Vector>();
        for(int x=0; x<a.matrix.size();x++){
            for(int y=0; y<a.matrix.get(0).vector.size();y++){
                ret.get(x).vector.add(a.matrix.get(x).vector.get(y) + b.matrix.get(x).vector.get(y));
            }
        }
        return new Matrix(ret);
    }

}
