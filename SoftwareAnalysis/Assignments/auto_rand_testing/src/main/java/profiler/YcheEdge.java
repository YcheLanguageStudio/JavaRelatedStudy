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
    public boolean equals(Object obj) {
        YcheEdge anotherEdge = (YcheEdge) obj;
        return anotherEdge.srcVertex == this.srcVertex && anotherEdge.dstVertex == this.dstVertex;
    }

    public static void main(String[] args) {
        YcheEdge firstEdge = new YcheEdge(3, 4);
        YcheEdge secondEdge = new YcheEdge(4, 3);
        YcheEdge thirdEdge = new YcheEdge(3, 4);
        System.out.println(firstEdge.equals(secondEdge));
        System.out.println(firstEdge.equals(thirdEdge));
    }
}
