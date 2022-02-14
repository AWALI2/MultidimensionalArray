public class MultidimensionalArray {

public static double distance(double[] arr1, double[] arr2) 
	{
	return
			Math.sqrt(Math.pow(arr2[0]-arr1[0], 2) + 
					Math.pow(arr2[1]-arr1[1], 2) +
					Math.pow(arr2[2]-arr1[2], 2));
	}

public static void main(String[] args) 
		{
	double[][] points = {{-1, 0, 3},
			{-1, -1, -1},
			{4, 1, 1},
			{2, 0.5, 9},
			{3.5, 2, -1},
			{3, 1.5, 3},
			{-1.5, 4, 2},
			{5.5, 4, -0.5}};
	
	int index1 = 0, index2 = 1;
	
		for(int i = 0; i < points.length; ++i)
		{
			for(int j = i+1; j < points.length; ++j) 
			{
				if(distance(points[i], points[j]) < distance(points[index1], points[index2])) 
				{
					index1 = i;
					index2 = j;
				}
			}
		}
		
		System.out.printf("Closest points are (%f, %f, %f) and (%f, %f, %f)\n",
				points[index1][0], points[index1][1], points[index1][2], points[index2][0],
				points[index2][1], points[index2][2]);
		
		System.out.println("Distance between closest points is " + distance(points[index1],
				points[index2]));
		}

	}