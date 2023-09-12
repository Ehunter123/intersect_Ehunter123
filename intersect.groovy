double size =90;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//create a sphere
CSG sphere = new Sphere(size/60*12.5).toCSG()
// perform a union
CSG cubePlusSphere = cube.intersect(sphere);

return [cubePlusSphere , cube.movex(size*1.5), sphere.movey(size*1.5)]