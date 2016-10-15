package profiler;

import java.util.Map;

import soot.*;
import soot.jimple.*;
import soot.util.*;

public class CoverageInstrumentor extends BodyTransformer{
	static SootClass counterClass;
    static SootMethod increaseCounter, reportCounter;

    static {
        counterClass = Scene.v().loadClassAndSupport("profiler.CoveredNodeHelper");
        Scene.v().setSootClassPath(null);
    }

	@Override
	protected void internalTransform(Body body, String phase, Map options) {
		
	}
}
