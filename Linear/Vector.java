package Linear;

import java.util.ArrayList;


public class Vector {
	public ArrayList<Double> vector;
	boolean orientation = false; //false=vertical true=horizontal
	
	public Vector(ArrayList<Double> input) {
		vector = input;
		
	}
	
	/*
	 * Adds given vector to local vector
	 */
	public ArrayList<Double> add(Vector vec){
		int size = 0;
		if(vector.size() > vec.vector.size()) {
			size = vec.vector.size();
		}else {
			size = vector.size();
			
		}
		
		for(int i=0;i<size;i++) {
			double set = vector.get(i) + vec.vector.get(i);
			vector.set(i, set);
			
		}
		
		return vector;
	}
	
	/*
	 * Subtracts given vector to local vector
	 */
	public ArrayList<Double> subtract(Vector vec){
		int size = 0;
		if(vector.size() > vec.vector.size()) {
			size = vec.vector.size();
		}else {
			size = vector.size();
			
		}
		
		for(int i=0;i<size;i++) {
			double set = vector.get(i) - vec.vector.get(i);
			vector.set(i, set);
			
		}
		
		return vector;
	}
	
	public void transform() {
		orientation = !orientation;
		
	}
	
	public Vector dotProduct(Vector vec){
		if (vector.size() == vec.vector.size()) {
			Vector v = new Vector(vector);
			for(int i=0;i<v.vector.size();i++) {
				double set = vector.get(i) * vec.vector.get(i);
				v.vector.set(i, set);
				
			}
			return v;
		}
		return null;
	}
	
	public void scale(int scalar) {
		for(int i=0;i<vector.size();i++) {
			double set = scalar*vector.get(i);
			vector.set(i,set);
			
		}
		
	}
}
