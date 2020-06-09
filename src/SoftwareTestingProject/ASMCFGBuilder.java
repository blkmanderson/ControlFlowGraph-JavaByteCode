package SoftwareTestingProject;

import java.io.InputStream;


public class ASMCFGBuilder {
	public ControlFlowGraph build(String className) throws ClassNotFoundException {
		ControlFlowGraph cfg = new ControlFlowGraph();
		
		InputStream is = ASMCFGBuilder.class.getResourceAsStream(className.replace('.', '/') + ".class");



		return cfg;
	}
}
