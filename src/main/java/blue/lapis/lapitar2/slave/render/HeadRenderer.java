package blue.lapis.lapitar2.slave.render;

import blue.lapis.lapitar2.Lapitar;


public class HeadRenderer extends Renderer {
	private Cube helm, head;
	@Override
	protected void initCubes() {
		Lapitar.log.info("initCubes");
		cubes.clear();
		helm = new Cube();
		helm.scaleX = helm.scaleY = helm.scaleZ = 1.1f;
		helm.z = -5;
		helm.y = 0.25f;
		helm.rotX = 25f;
		helm.rotY = 45f;
		addCube(helm);
		head = new Cube();
		head.z = -5.05f;
		head.y = 0.30f;
		head.rotX = 25f;
		head.rotY = 45f;
		addCube(head);
	}
	
}
