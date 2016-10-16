package profiler;

/**
 * Created by cheyulin on 10/16/16.
 */

public class YcheEdge {
    Integer srcVertex;
    Integer dstVertex;

    public YcheEdge() {
        srcVertex = -1;
        dstVertex = -1;
    }

    public YcheEdge(Integer srcVertex, Integer dstVertex) {
        this.srcVertex = srcVertex;
        this.dstVertex = dstVertex;
    }


    public String toString() {
        return new String("Src:" + srcVertex + ",Dst:" + dstVertex);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + srcVertex;
        result = result * 31 + dstVertex;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YcheEdge)) {
            return false;
        }
        YcheEdge comparedObj = (YcheEdge) obj;

        if (this.srcVertex.equals(comparedObj.srcVertex) && this.dstVertex.equals(comparedObj.dstVertex)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        YcheEdge firstEdge = new YcheEdge(3, 4);
        YcheEdge secondEdge = new YcheEdge(4, 3);
        YcheEdge thirdEdge = new YcheEdge(3, 4);
        System.out.println(firstEdge.equals(secondEdge));
        System.out.println(firstEdge.equals(thirdEdge));
    }
}
