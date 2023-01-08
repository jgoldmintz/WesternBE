//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.core;

public class IMOps extends Operation {
    protected IMOps() {
    }

    public IMOps adaptiveBlur() {
        this.iCmdArgs.add("-adaptive-blur");
        return this;
    }

    public IMOps adaptiveBlur(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-blur");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps adaptiveBlur(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-blur");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps adaptiveResize() {
        this.iCmdArgs.add("-adaptive-resize");
        return this;
    }

    public IMOps adaptiveResize(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-resize");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps adaptiveResize(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-resize");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps adaptiveResize(Integer var1, Integer var2, Character var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-resize");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps adaptiveResize(Integer var1, Integer var2, String var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-resize");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps adaptiveSharpen() {
        this.iCmdArgs.add("-adaptive-sharpen");
        return this;
    }

    public IMOps adaptiveSharpen(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-sharpen");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps adaptiveSharpen(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-adaptive-sharpen");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps adjoin() {
        this.iCmdArgs.add("-adjoin");
        return this;
    }

    public IMOps p_adjoin() {
        this.iCmdArgs.add("+adjoin");
        return this;
    }

    public IMOps affine() {
        this.iCmdArgs.add("-affine");
        return this;
    }

    public IMOps affine(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-affine");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps affine(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-affine");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps affine(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-affine");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(",");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps affine(Double var1, Double var2, Double var3, Double var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-affine");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append(",");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var6.append(",");
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6.append(",");
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps affine(Double var1, Double var2, Double var3, Double var4, Double var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-affine");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append(",");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var7.append(",");
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var7.append(",");
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var7.append(",");
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps affine(Double var1, Double var2, Double var3, Double var4, Double var5, Double var6) {
        StringBuffer var8 = new StringBuffer();
        this.iCmdArgs.add("-affine");
        if (var1 != null) {
            var8.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var8.append(",");
        }

        if (var2 != null) {
            var8.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var8.append(",");
        }

        if (var3 != null) {
            var8.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var8.append(",");
        }

        if (var4 != null) {
            var8.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var8.append(",");
        }

        if (var5 != null) {
            var8.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var8.append(",");
        }

        if (var6 != null) {
            var8.append(var6.toString());
        }

        if (var8.length() > 0) {
            this.iCmdArgs.add(var8.toString());
        }

        return this;
    }

    public IMOps alpha() {
        this.iCmdArgs.add("-alpha");
        return this;
    }

    public IMOps alpha(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-alpha");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps annotate() {
        this.iCmdArgs.add("-annotate");
        return this;
    }

    public IMOps annotate(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-annotate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps annotate(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-annotate");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps annotate(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-annotate");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps annotate(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-annotate");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps annotate(Integer var1, Integer var2, Integer var3, Integer var4, String var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-annotate");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            this.iCmdArgs.add(var7.toString());
            var7.setLength(0);
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps antialias() {
        this.iCmdArgs.add("-antialias");
        return this;
    }

    public IMOps p_antialias() {
        this.iCmdArgs.add("+antialias");
        return this;
    }

    public IMOps append() {
        this.iCmdArgs.add("-append");
        return this;
    }

    public IMOps p_append() {
        this.iCmdArgs.add("+append");
        return this;
    }

    public IMOps attenuate() {
        this.iCmdArgs.add("-attenuate");
        return this;
    }

    public IMOps attenuate(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-attenuate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps authenticate() {
        this.iCmdArgs.add("-authenticate");
        return this;
    }

    public IMOps authenticate(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-authenticate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps autoGamma() {
        this.iCmdArgs.add("-auto-gamma");
        return this;
    }

    public IMOps autoLevel() {
        this.iCmdArgs.add("-auto-level");
        return this;
    }

    public IMOps autoOrient() {
        this.iCmdArgs.add("-auto-orient");
        return this;
    }

    public IMOps average() {
        this.iCmdArgs.add("-average");
        return this;
    }

    public IMOps backdrop() {
        this.iCmdArgs.add("-backdrop");
        return this;
    }

    public IMOps backdrop(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-backdrop");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps background() {
        this.iCmdArgs.add("-background");
        return this;
    }

    public IMOps background(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-background");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps bench() {
        this.iCmdArgs.add("-bench");
        return this;
    }

    public IMOps bench(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-bench");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps blend() {
        this.iCmdArgs.add("-blend");
        return this;
    }

    public IMOps blend(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-blend");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps blend(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-blend");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps bias() {
        this.iCmdArgs.add("-bias");
        return this;
    }

    public IMOps bias(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-bias");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps bias(Integer var1, Boolean var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-bias");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 == null && var2 != null) {
        }

        if (var2 != null && var2) {
            var4.append("%");
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps blackPointCompensation() {
        this.iCmdArgs.add("-black-point-compensation");
        return this;
    }

    public IMOps blackThreshold() {
        this.iCmdArgs.add("-black-threshold");
        return this;
    }

    public IMOps blackThreshold(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-black-threshold");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps blackThreshold(Double var1, Boolean var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-black-threshold");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 == null && var2 != null) {
        }

        if (var2 != null && var2) {
            var4.append("%");
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps bluePrimary() {
        this.iCmdArgs.add("-blue-primary");
        return this;
    }

    public IMOps bluePrimary(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-blue-primary");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps bluePrimary(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-blue-primary");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps blueShift() {
        this.iCmdArgs.add("-blue-shift");
        return this;
    }

    public IMOps blueShift(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-blue-shift");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps blur() {
        this.iCmdArgs.add("-blur");
        return this;
    }

    public IMOps blur(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-blur");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps blur(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-blur");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps bordercolor() {
        this.iCmdArgs.add("-bordercolor");
        return this;
    }

    public IMOps bordercolor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-bordercolor");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps border() {
        this.iCmdArgs.add("-border");
        return this;
    }

    public IMOps border(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-border");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps border(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-border");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps borderwidth() {
        this.iCmdArgs.add("-borderwidth");
        return this;
    }

    public IMOps borderwidth(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-borderwidth");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps borderwidth(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-borderwidth");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps borderwidth(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-borderwidth");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps borderwidth(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-borderwidth");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps brightnessContrast() {
        this.iCmdArgs.add("-brightness-contrast");
        return this;
    }

    public IMOps brightnessContrast(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-brightness-contrast");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps brightnessContrast(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-brightness-contrast");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps brightnessContrast(Double var1, Double var2, Boolean var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-brightness-contrast");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var5.append("%");
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps cache() {
        this.iCmdArgs.add("-cache");
        return this;
    }

    public IMOps cache(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-cache");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps caption() {
        this.iCmdArgs.add("-caption");
        return this;
    }

    public IMOps caption(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-caption");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps cdl() {
        this.iCmdArgs.add("-cdl");
        return this;
    }

    public IMOps cdl(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-cdl");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_channel() {
        this.iCmdArgs.add("+channel");
        return this;
    }

    public IMOps channel() {
        this.iCmdArgs.add("-channel");
        return this;
    }

    public IMOps channel(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-channel");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps charcoal() {
        this.iCmdArgs.add("-charcoal");
        return this;
    }

    public IMOps charcoal(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-charcoal");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps chop() {
        this.iCmdArgs.add("-chop");
        return this;
    }

    public IMOps chop(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-chop");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps chop(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-chop");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps chop(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-chop");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps chop(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-chop");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps chop(Integer var1, Integer var2, Integer var3, Integer var4, Boolean var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-chop");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null && var5) {
            var7.append("%");
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps clamp() {
        this.iCmdArgs.add("-clamp");
        return this;
    }

    public IMOps clip() {
        this.iCmdArgs.add("-clip");
        return this;
    }

    public IMOps clipMask() {
        this.iCmdArgs.add("-clip-mask");
        return this;
    }

    public IMOps clipPath() {
        this.iCmdArgs.add("-clip-path");
        return this;
    }

    public IMOps clipPath(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-clip-path");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_clipPath() {
        this.iCmdArgs.add("+clip-path");
        return this;
    }

    public IMOps p_clipPath(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+clip-path");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_clone() {
        this.iCmdArgs.add("+clone");
        return this;
    }

    public IMOps clone() {
        this.iCmdArgs.add("-clone");
        return this;
    }

    public IMOps clone(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-clone");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps clone(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-clone");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps clone(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-clone");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(",");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps clone(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-clone");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps clut() {
        this.iCmdArgs.add("-clut");
        return this;
    }

    public IMOps coalesce() {
        this.iCmdArgs.add("-coalesce");
        return this;
    }

    public IMOps colorize() {
        this.iCmdArgs.add("-colorize");
        return this;
    }

    public IMOps colorize(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-colorize");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps colorize(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-colorize");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps colorize(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-colorize");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(",");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps colormap() {
        this.iCmdArgs.add("-colormap");
        return this;
    }

    public IMOps colormap(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-colormap");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps colorMatrix() {
        this.iCmdArgs.add("-color-matrix");
        return this;
    }

    public IMOps colorMatrix(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-color-matrix");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps colors() {
        this.iCmdArgs.add("-colors");
        return this;
    }

    public IMOps colors(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-colors");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps colorspace() {
        this.iCmdArgs.add("-colorspace");
        return this;
    }

    public IMOps colorspace(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-colorspace");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps combine() {
        this.iCmdArgs.add("-combine");
        return this;
    }

    public IMOps comment() {
        this.iCmdArgs.add("-comment");
        return this;
    }

    public IMOps comment(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-comment");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps compose() {
        this.iCmdArgs.add("-compose");
        return this;
    }

    public IMOps compose(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-compose");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps composite() {
        this.iCmdArgs.add("-composite");
        return this;
    }

    public IMOps p_compress() {
        this.iCmdArgs.add("+compress");
        return this;
    }

    public IMOps compress() {
        this.iCmdArgs.add("-compress");
        return this;
    }

    public IMOps compress(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-compress");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps contrast() {
        this.iCmdArgs.add("-contrast");
        return this;
    }

    public IMOps p_contrast() {
        this.iCmdArgs.add("+contrast");
        return this;
    }

    public IMOps contrastStretch() {
        this.iCmdArgs.add("-contrast-stretch");
        return this;
    }

    public IMOps contrastStretch(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-contrast-stretch");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps contrastStretch(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-contrast-stretch");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps contrastStretch(Integer var1, Integer var2, Boolean var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-contrast-stretch");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var5.append("%");
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps convolve() {
        this.iCmdArgs.add("-convolve");
        return this;
    }

    public IMOps convolve(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(",");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append(",");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var6.append(",");
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6.append(",");
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append(",");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var7.append(",");
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var7.append(",");
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var7.append(",");
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6) {
        StringBuffer var8 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var8.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var8.append(",");
        }

        if (var2 != null) {
            var8.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var8.append(",");
        }

        if (var3 != null) {
            var8.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var8.append(",");
        }

        if (var4 != null) {
            var8.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var8.append(",");
        }

        if (var5 != null) {
            var8.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var8.append(",");
        }

        if (var6 != null) {
            var8.append(var6.toString());
        }

        if (var8.length() > 0) {
            this.iCmdArgs.add(var8.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7) {
        StringBuffer var9 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var9.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var9.append(",");
        }

        if (var2 != null) {
            var9.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var9.append(",");
        }

        if (var3 != null) {
            var9.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var9.append(",");
        }

        if (var4 != null) {
            var9.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var9.append(",");
        }

        if (var5 != null) {
            var9.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var9.append(",");
        }

        if (var6 != null) {
            var9.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var9.append(",");
        }

        if (var7 != null) {
            var9.append(var7.toString());
        }

        if (var9.length() > 0) {
            this.iCmdArgs.add(var9.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8) {
        StringBuffer var10 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var10.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var10.append(",");
        }

        if (var2 != null) {
            var10.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var10.append(",");
        }

        if (var3 != null) {
            var10.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var10.append(",");
        }

        if (var4 != null) {
            var10.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var10.append(",");
        }

        if (var5 != null) {
            var10.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var10.append(",");
        }

        if (var6 != null) {
            var10.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var10.append(",");
        }

        if (var7 != null) {
            var10.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var10.append(",");
        }

        if (var8 != null) {
            var10.append(var8.toString());
        }

        if (var10.length() > 0) {
            this.iCmdArgs.add(var10.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9) {
        StringBuffer var11 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var11.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var11.append(",");
        }

        if (var2 != null) {
            var11.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var11.append(",");
        }

        if (var3 != null) {
            var11.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var11.append(",");
        }

        if (var4 != null) {
            var11.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var11.append(",");
        }

        if (var5 != null) {
            var11.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var11.append(",");
        }

        if (var6 != null) {
            var11.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var11.append(",");
        }

        if (var7 != null) {
            var11.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var11.append(",");
        }

        if (var8 != null) {
            var11.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var11.append(",");
        }

        if (var9 != null) {
            var11.append(var9.toString());
        }

        if (var11.length() > 0) {
            this.iCmdArgs.add(var11.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9, Integer var10) {
        StringBuffer var12 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var12.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var12.append(",");
        }

        if (var2 != null) {
            var12.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var12.append(",");
        }

        if (var3 != null) {
            var12.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var12.append(",");
        }

        if (var4 != null) {
            var12.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var12.append(",");
        }

        if (var5 != null) {
            var12.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var12.append(",");
        }

        if (var6 != null) {
            var12.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var12.append(",");
        }

        if (var7 != null) {
            var12.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var12.append(",");
        }

        if (var8 != null) {
            var12.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var12.append(",");
        }

        if (var9 != null) {
            var12.append(var9.toString());
        }

        if (var9 != null || var10 != null) {
            var12.append(",");
        }

        if (var10 != null) {
            var12.append(var10.toString());
        }

        if (var12.length() > 0) {
            this.iCmdArgs.add(var12.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9, Integer var10, Integer var11) {
        StringBuffer var13 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var13.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var13.append(",");
        }

        if (var2 != null) {
            var13.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var13.append(",");
        }

        if (var3 != null) {
            var13.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var13.append(",");
        }

        if (var4 != null) {
            var13.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var13.append(",");
        }

        if (var5 != null) {
            var13.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var13.append(",");
        }

        if (var6 != null) {
            var13.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var13.append(",");
        }

        if (var7 != null) {
            var13.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var13.append(",");
        }

        if (var8 != null) {
            var13.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var13.append(",");
        }

        if (var9 != null) {
            var13.append(var9.toString());
        }

        if (var9 != null || var10 != null) {
            var13.append(",");
        }

        if (var10 != null) {
            var13.append(var10.toString());
        }

        if (var10 != null || var11 != null) {
            var13.append(",");
        }

        if (var11 != null) {
            var13.append(var11.toString());
        }

        if (var13.length() > 0) {
            this.iCmdArgs.add(var13.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9, Integer var10, Integer var11, Integer var12) {
        StringBuffer var14 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var14.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var14.append(",");
        }

        if (var2 != null) {
            var14.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var14.append(",");
        }

        if (var3 != null) {
            var14.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var14.append(",");
        }

        if (var4 != null) {
            var14.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var14.append(",");
        }

        if (var5 != null) {
            var14.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var14.append(",");
        }

        if (var6 != null) {
            var14.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var14.append(",");
        }

        if (var7 != null) {
            var14.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var14.append(",");
        }

        if (var8 != null) {
            var14.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var14.append(",");
        }

        if (var9 != null) {
            var14.append(var9.toString());
        }

        if (var9 != null || var10 != null) {
            var14.append(",");
        }

        if (var10 != null) {
            var14.append(var10.toString());
        }

        if (var10 != null || var11 != null) {
            var14.append(",");
        }

        if (var11 != null) {
            var14.append(var11.toString());
        }

        if (var11 != null || var12 != null) {
            var14.append(",");
        }

        if (var12 != null) {
            var14.append(var12.toString());
        }

        if (var14.length() > 0) {
            this.iCmdArgs.add(var14.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9, Integer var10, Integer var11, Integer var12, Integer var13) {
        StringBuffer var15 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var15.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var15.append(",");
        }

        if (var2 != null) {
            var15.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var15.append(",");
        }

        if (var3 != null) {
            var15.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var15.append(",");
        }

        if (var4 != null) {
            var15.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var15.append(",");
        }

        if (var5 != null) {
            var15.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var15.append(",");
        }

        if (var6 != null) {
            var15.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var15.append(",");
        }

        if (var7 != null) {
            var15.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var15.append(",");
        }

        if (var8 != null) {
            var15.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var15.append(",");
        }

        if (var9 != null) {
            var15.append(var9.toString());
        }

        if (var9 != null || var10 != null) {
            var15.append(",");
        }

        if (var10 != null) {
            var15.append(var10.toString());
        }

        if (var10 != null || var11 != null) {
            var15.append(",");
        }

        if (var11 != null) {
            var15.append(var11.toString());
        }

        if (var11 != null || var12 != null) {
            var15.append(",");
        }

        if (var12 != null) {
            var15.append(var12.toString());
        }

        if (var12 != null || var13 != null) {
            var15.append(",");
        }

        if (var13 != null) {
            var15.append(var13.toString());
        }

        if (var15.length() > 0) {
            this.iCmdArgs.add(var15.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9, Integer var10, Integer var11, Integer var12, Integer var13, Integer var14) {
        StringBuffer var16 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var16.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var16.append(",");
        }

        if (var2 != null) {
            var16.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var16.append(",");
        }

        if (var3 != null) {
            var16.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var16.append(",");
        }

        if (var4 != null) {
            var16.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var16.append(",");
        }

        if (var5 != null) {
            var16.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var16.append(",");
        }

        if (var6 != null) {
            var16.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var16.append(",");
        }

        if (var7 != null) {
            var16.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var16.append(",");
        }

        if (var8 != null) {
            var16.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var16.append(",");
        }

        if (var9 != null) {
            var16.append(var9.toString());
        }

        if (var9 != null || var10 != null) {
            var16.append(",");
        }

        if (var10 != null) {
            var16.append(var10.toString());
        }

        if (var10 != null || var11 != null) {
            var16.append(",");
        }

        if (var11 != null) {
            var16.append(var11.toString());
        }

        if (var11 != null || var12 != null) {
            var16.append(",");
        }

        if (var12 != null) {
            var16.append(var12.toString());
        }

        if (var12 != null || var13 != null) {
            var16.append(",");
        }

        if (var13 != null) {
            var16.append(var13.toString());
        }

        if (var13 != null || var14 != null) {
            var16.append(",");
        }

        if (var14 != null) {
            var16.append(var14.toString());
        }

        if (var16.length() > 0) {
            this.iCmdArgs.add(var16.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9, Integer var10, Integer var11, Integer var12, Integer var13, Integer var14, Integer var15) {
        StringBuffer var17 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var17.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var17.append(",");
        }

        if (var2 != null) {
            var17.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var17.append(",");
        }

        if (var3 != null) {
            var17.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var17.append(",");
        }

        if (var4 != null) {
            var17.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var17.append(",");
        }

        if (var5 != null) {
            var17.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var17.append(",");
        }

        if (var6 != null) {
            var17.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var17.append(",");
        }

        if (var7 != null) {
            var17.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var17.append(",");
        }

        if (var8 != null) {
            var17.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var17.append(",");
        }

        if (var9 != null) {
            var17.append(var9.toString());
        }

        if (var9 != null || var10 != null) {
            var17.append(",");
        }

        if (var10 != null) {
            var17.append(var10.toString());
        }

        if (var10 != null || var11 != null) {
            var17.append(",");
        }

        if (var11 != null) {
            var17.append(var11.toString());
        }

        if (var11 != null || var12 != null) {
            var17.append(",");
        }

        if (var12 != null) {
            var17.append(var12.toString());
        }

        if (var12 != null || var13 != null) {
            var17.append(",");
        }

        if (var13 != null) {
            var17.append(var13.toString());
        }

        if (var13 != null || var14 != null) {
            var17.append(",");
        }

        if (var14 != null) {
            var17.append(var14.toString());
        }

        if (var14 != null || var15 != null) {
            var17.append(",");
        }

        if (var15 != null) {
            var17.append(var15.toString());
        }

        if (var17.length() > 0) {
            this.iCmdArgs.add(var17.toString());
        }

        return this;
    }

    public IMOps convolve(Integer var1, Integer var2, Integer var3, Integer var4, Integer var5, Integer var6, Integer var7, Integer var8, Integer var9, Integer var10, Integer var11, Integer var12, Integer var13, Integer var14, Integer var15, Integer var16) {
        StringBuffer var18 = new StringBuffer();
        this.iCmdArgs.add("-convolve");
        if (var1 != null) {
            var18.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var18.append(",");
        }

        if (var2 != null) {
            var18.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var18.append(",");
        }

        if (var3 != null) {
            var18.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var18.append(",");
        }

        if (var4 != null) {
            var18.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var18.append(",");
        }

        if (var5 != null) {
            var18.append(var5.toString());
        }

        if (var5 != null || var6 != null) {
            var18.append(",");
        }

        if (var6 != null) {
            var18.append(var6.toString());
        }

        if (var6 != null || var7 != null) {
            var18.append(",");
        }

        if (var7 != null) {
            var18.append(var7.toString());
        }

        if (var7 != null || var8 != null) {
            var18.append(",");
        }

        if (var8 != null) {
            var18.append(var8.toString());
        }

        if (var8 != null || var9 != null) {
            var18.append(",");
        }

        if (var9 != null) {
            var18.append(var9.toString());
        }

        if (var9 != null || var10 != null) {
            var18.append(",");
        }

        if (var10 != null) {
            var18.append(var10.toString());
        }

        if (var10 != null || var11 != null) {
            var18.append(",");
        }

        if (var11 != null) {
            var18.append(var11.toString());
        }

        if (var11 != null || var12 != null) {
            var18.append(",");
        }

        if (var12 != null) {
            var18.append(var12.toString());
        }

        if (var12 != null || var13 != null) {
            var18.append(",");
        }

        if (var13 != null) {
            var18.append(var13.toString());
        }

        if (var13 != null || var14 != null) {
            var18.append(",");
        }

        if (var14 != null) {
            var18.append(var14.toString());
        }

        if (var14 != null || var15 != null) {
            var18.append(",");
        }

        if (var15 != null) {
            var18.append(var15.toString());
        }

        if (var15 != null || var16 != null) {
            var18.append(",");
        }

        if (var16 != null) {
            var18.append(var16.toString());
        }

        if (var18.length() > 0) {
            this.iCmdArgs.add(var18.toString());
        }

        return this;
    }

    public IMOps crop() {
        this.iCmdArgs.add("-crop");
        return this;
    }

    public IMOps crop(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-crop");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps crop(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-crop");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps crop(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-crop");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps crop(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-crop");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps crop(Integer var1, Integer var2, Integer var3, Integer var4, Character var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-crop");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps crop(Integer var1, Integer var2, Integer var3, Integer var4, String var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-crop");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps cycle() {
        this.iCmdArgs.add("-cycle");
        return this;
    }

    public IMOps cycle(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-cycle");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_debug() {
        this.iCmdArgs.add("+debug");
        return this;
    }

    public IMOps debug() {
        this.iCmdArgs.add("-debug");
        return this;
    }

    public IMOps debug(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-debug");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps decipher() {
        this.iCmdArgs.add("-decipher");
        return this;
    }

    public IMOps decipher(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-decipher");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps deconstruct() {
        this.iCmdArgs.add("-deconstruct");
        return this;
    }

    public IMOps p_define() {
        this.iCmdArgs.add("+define");
        return this;
    }

    public IMOps p_define(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+define");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps define() {
        this.iCmdArgs.add("-define");
        return this;
    }

    public IMOps define(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-define");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps delay() {
        this.iCmdArgs.add("-delay");
        return this;
    }

    public IMOps delay(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-delay");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps delay(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-delay");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps delay(Integer var1, Integer var2, Character var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-delay");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps p_delete() {
        this.iCmdArgs.add("+delete");
        return this;
    }

    public IMOps delete() {
        this.iCmdArgs.add("-delete");
        return this;
    }

    public IMOps delete(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-delete");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps delete(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-delete");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps delete(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-delete");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(",");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps delete(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-delete");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps density() {
        this.iCmdArgs.add("-density");
        return this;
    }

    public IMOps density(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-density");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps density(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-density");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps depth() {
        this.iCmdArgs.add("-depth");
        return this;
    }

    public IMOps depth(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-depth");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps descend() {
        this.iCmdArgs.add("-descend");
        return this;
    }

    public IMOps deskew() {
        this.iCmdArgs.add("-deskew");
        return this;
    }

    public IMOps deskew(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-deskew");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps despeckle() {
        this.iCmdArgs.add("-despeckle");
        return this;
    }

    public IMOps direction() {
        this.iCmdArgs.add("-direction");
        return this;
    }

    public IMOps direction(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-direction");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps displace() {
        this.iCmdArgs.add("-displace");
        return this;
    }

    public IMOps displace(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-displace");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps displace(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-displace");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps display() {
        this.iCmdArgs.add("-display");
        return this;
    }

    public IMOps display(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-display");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps display(String var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-display");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(":");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps display(String var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-display");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(":");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(".");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps p_dispose() {
        this.iCmdArgs.add("+dispose");
        return this;
    }

    public IMOps dispose() {
        this.iCmdArgs.add("-dispose");
        return this;
    }

    public IMOps dispose(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-dispose");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps dissimilarityThreshold() {
        this.iCmdArgs.add("-dissimilarity-threshold");
        return this;
    }

    public IMOps dissimilarityThreshold(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-dissimilarity-threshold");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps dissolve() {
        this.iCmdArgs.add("-dissolve");
        return this;
    }

    public IMOps dissolve(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-dissolve");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps distort() {
        this.iCmdArgs.add("-distort");
        return this;
    }

    public IMOps distort(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-distort");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps distort(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-distort");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_distort() {
        this.iCmdArgs.add("+distort");
        return this;
    }

    public IMOps p_distort(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+distort");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_distort(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("+distort");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_dither() {
        this.iCmdArgs.add("+dither");
        return this;
    }

    public IMOps dither() {
        this.iCmdArgs.add("-dither");
        return this;
    }

    public IMOps dither(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-dither");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps draw() {
        this.iCmdArgs.add("-draw");
        return this;
    }

    public IMOps draw(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-draw");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps duplicate() {
        this.iCmdArgs.add("-duplicate");
        return this;
    }

    public IMOps duplicate(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-duplicate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps duplicate(Integer var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-duplicate");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_duplicate() {
        this.iCmdArgs.add("+duplicate");
        return this;
    }

    public IMOps edge() {
        this.iCmdArgs.add("-edge");
        return this;
    }

    public IMOps edge(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-edge");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps emboss() {
        this.iCmdArgs.add("-emboss");
        return this;
    }

    public IMOps emboss(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-emboss");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps encipher() {
        this.iCmdArgs.add("-encipher");
        return this;
    }

    public IMOps encipher(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-encipher");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps encoding() {
        this.iCmdArgs.add("-encoding");
        return this;
    }

    public IMOps encoding(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-encoding");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_endian() {
        this.iCmdArgs.add("+endian");
        return this;
    }

    public IMOps endian() {
        this.iCmdArgs.add("-endian");
        return this;
    }

    public IMOps endian(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-endian");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps enhance() {
        this.iCmdArgs.add("-enhance");
        return this;
    }

    public IMOps equalize() {
        this.iCmdArgs.add("-equalize");
        return this;
    }

    public IMOps evaluate() {
        this.iCmdArgs.add("-evaluate");
        return this;
    }

    public IMOps evaluate(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-evaluate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps evaluate(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-evaluate");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps evaluateSequence() {
        this.iCmdArgs.add("-evaluate-sequence");
        return this;
    }

    public IMOps evaluateSequence(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-evaluate-sequence");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps extent() {
        this.iCmdArgs.add("-extent");
        return this;
    }

    public IMOps extent(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-extent");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps extent(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-extent");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps extent(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-extent");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps extent(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-extent");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps extract() {
        this.iCmdArgs.add("-extract");
        return this;
    }

    public IMOps extract(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-extract");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps extract(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-extract");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps extract(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-extract");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps extract(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-extract");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps family() {
        this.iCmdArgs.add("-family");
        return this;
    }

    public IMOps family(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-family");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps features() {
        this.iCmdArgs.add("-features");
        return this;
    }

    public IMOps features(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-features");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps fft() {
        this.iCmdArgs.add("-fft");
        return this;
    }

    public IMOps fill() {
        this.iCmdArgs.add("-fill");
        return this;
    }

    public IMOps fill(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-fill");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps filter() {
        this.iCmdArgs.add("-filter");
        return this;
    }

    public IMOps filter(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-filter");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps flatten() {
        this.iCmdArgs.add("-flatten");
        return this;
    }

    public IMOps flip() {
        this.iCmdArgs.add("-flip");
        return this;
    }

    public IMOps floodfill() {
        this.iCmdArgs.add("-floodfill");
        return this;
    }

    public IMOps floodfill(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-floodfill");
        String var2 = "+";
        if (var1.doubleValue() < 0.0) {
            var2 = "";
        }

        var3.append(var2);
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps floodfill(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-floodfill");
        String var3 = "+";
        if (var1.doubleValue() < 0.0) {
            var3 = "";
        }

        var4.append(var3);
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var3 = "+";
            if (var2.doubleValue() < 0.0) {
                var3 = "";
            }

            var4.append(var3);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps floodfill(Integer var1, Integer var2, String var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-floodfill");
        String var4 = "+";
        if (var1.doubleValue() < 0.0) {
            var4 = "";
        }

        var5.append(var4);
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4 = "+";
            if (var2.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            this.iCmdArgs.add(var5.toString());
            var5.setLength(0);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps flop() {
        this.iCmdArgs.add("-flop");
        return this;
    }

    public IMOps font() {
        this.iCmdArgs.add("-font");
        return this;
    }

    public IMOps font(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-font");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps foreground() {
        this.iCmdArgs.add("-foreground");
        return this;
    }

    public IMOps foreground(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-foreground");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps format() {
        this.iCmdArgs.add("-format");
        return this;
    }

    public IMOps format(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-format");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps frame() {
        this.iCmdArgs.add("-frame");
        return this;
    }

    public IMOps frame(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-frame");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps frame(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-frame");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps frame(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-frame");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps frame(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-frame");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps function() {
        this.iCmdArgs.add("-function");
        return this;
    }

    public IMOps function(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-function");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps function(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-function");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps fuzz() {
        this.iCmdArgs.add("-fuzz");
        return this;
    }

    public IMOps fuzz(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-fuzz");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps fuzz(Double var1, Boolean var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-fuzz");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 == null && var2 != null) {
        }

        if (var2 != null && var2) {
            var4.append("%");
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps fx() {
        this.iCmdArgs.add("-fx");
        return this;
    }

    public IMOps fx(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-fx");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps gamma() {
        this.iCmdArgs.add("-gamma");
        return this;
    }

    public IMOps gamma(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-gamma");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_gamma() {
        this.iCmdArgs.add("+gamma");
        return this;
    }

    public IMOps p_gamma(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+gamma");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps gaussianBlur() {
        this.iCmdArgs.add("-gaussian-blur");
        return this;
    }

    public IMOps gaussianBlur(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-gaussian-blur");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps gaussianBlur(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-gaussian-blur");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps geometry() {
        this.iCmdArgs.add("-geometry");
        return this;
    }

    public IMOps geometry(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-geometry");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps geometry(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-geometry");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps geometry(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-geometry");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps geometry(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-geometry");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps gravity() {
        this.iCmdArgs.add("-gravity");
        return this;
    }

    public IMOps gravity(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-gravity");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps greenPrimary() {
        this.iCmdArgs.add("-green-primary");
        return this;
    }

    public IMOps greenPrimary(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-green-primary");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps greenPrimary(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-green-primary");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps help() {
        this.iCmdArgs.add("-help");
        return this;
    }

    public IMOps haldClut() {
        this.iCmdArgs.add("-hald-clut");
        return this;
    }

    public IMOps highlightColor() {
        this.iCmdArgs.add("-highlight-color");
        return this;
    }

    public IMOps highlightColor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-highlight-color");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps iconGeometry() {
        this.iCmdArgs.add("-iconGeometry");
        return this;
    }

    public IMOps iconGeometry(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-iconGeometry");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps iconGeometry(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-iconGeometry");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps iconGeometry(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-iconGeometry");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps iconGeometry(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-iconGeometry");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps iconic() {
        this.iCmdArgs.add("-iconic");
        return this;
    }

    public IMOps identify() {
        this.iCmdArgs.add("-identify");
        return this;
    }

    public IMOps ift() {
        this.iCmdArgs.add("-ift");
        return this;
    }

    public IMOps immutable() {
        this.iCmdArgs.add("-immutable");
        return this;
    }

    public IMOps implode() {
        this.iCmdArgs.add("-implode");
        return this;
    }

    public IMOps implode(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-implode");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps insert() {
        this.iCmdArgs.add("-insert");
        return this;
    }

    public IMOps insert(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-insert");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps intent() {
        this.iCmdArgs.add("-intent");
        return this;
    }

    public IMOps intent(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-intent");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps interlace() {
        this.iCmdArgs.add("-interlace");
        return this;
    }

    public IMOps interlace(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-interlace");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps interlineSpacing() {
        this.iCmdArgs.add("-interline-spacing");
        return this;
    }

    public IMOps interlineSpacing(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-interline-spacing");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps interpolate() {
        this.iCmdArgs.add("-interpolate");
        return this;
    }

    public IMOps interpolate(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-interpolate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps interwordSpacing() {
        this.iCmdArgs.add("-interword-spacing");
        return this;
    }

    public IMOps interwordSpacing(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-interword-spacing");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps kerning() {
        this.iCmdArgs.add("-kerning");
        return this;
    }

    public IMOps kerning(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-kerning");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_label() {
        this.iCmdArgs.add("+label");
        return this;
    }

    public IMOps label() {
        this.iCmdArgs.add("-label");
        return this;
    }

    public IMOps label(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-label");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps lat() {
        this.iCmdArgs.add("-lat");
        return this;
    }

    public IMOps lat(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-lat");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps lat(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-lat");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps lat(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-lat");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps lat(Integer var1, Integer var2, Integer var3, Boolean var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-lat");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 == null && var4 != null) {
        }

        if (var4 != null && var4) {
            var6.append("%");
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps layers() {
        this.iCmdArgs.add("-layers");
        return this;
    }

    public IMOps layers(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-layers");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps levelColors() {
        this.iCmdArgs.add("-level-colors");
        return this;
    }

    public IMOps levelColors(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-level-colors");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps levelColors(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-level-colors");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_levelColors() {
        this.iCmdArgs.add("+level-colors");
        return this;
    }

    public IMOps p_levelColors(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+level-colors");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_levelColors(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("+level-colors");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps level() {
        this.iCmdArgs.add("-level");
        return this;
    }

    public IMOps level(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-level");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps level(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-level");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps level(Double var1, Double var2, Boolean var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-level");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var5.append("%");
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps level(Double var1, Double var2, Boolean var3, Double var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-level");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append(",");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var6.append("%");
        }

        if (var3 != null || var4 != null) {
            var6.append(",");
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps p_level() {
        this.iCmdArgs.add("+level");
        return this;
    }

    public IMOps p_level(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+level");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_level(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("+level");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_level(Double var1, Double var2, Boolean var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("+level");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var5.append("%");
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps p_level(Double var1, Double var2, Boolean var3, Double var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("+level");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append(",");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var6.append("%");
        }

        if (var3 != null || var4 != null) {
            var6.append(",");
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps limit() {
        this.iCmdArgs.add("-limit");
        return this;
    }

    public IMOps limit(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-limit");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps linearStretch() {
        this.iCmdArgs.add("-linear-stretch");
        return this;
    }

    public IMOps linearStretch(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-linear-stretch");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps linearStretch(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-linear-stretch");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps linearStretch(Double var1, Double var2, Boolean var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-linear-stretch");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var5.append("%");
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps linewidth() {
        this.iCmdArgs.add("-linewidth");
        return this;
    }

    public IMOps liquidRescale() {
        this.iCmdArgs.add("-liquid-rescale");
        return this;
    }

    public IMOps liquidRescale(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-liquid-rescale");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps liquidRescale(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-liquid-rescale");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps liquidRescale(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-liquid-rescale");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps liquidRescale(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-liquid-rescale");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps list() {
        this.iCmdArgs.add("-list");
        return this;
    }

    public IMOps list(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-list");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps log() {
        this.iCmdArgs.add("-log");
        return this;
    }

    public IMOps log(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-log");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps loop() {
        this.iCmdArgs.add("-loop");
        return this;
    }

    public IMOps loop(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-loop");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps lowlightColor() {
        this.iCmdArgs.add("-lowlight-color");
        return this;
    }

    public IMOps lowlightColor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-lowlight-color");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps magnify() {
        this.iCmdArgs.add("-magnify");
        return this;
    }

    public IMOps magnify(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-magnify");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_map() {
        this.iCmdArgs.add("+map");
        return this;
    }

    public IMOps map() {
        this.iCmdArgs.add("-map");
        return this;
    }

    public IMOps map(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-map");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_mask() {
        this.iCmdArgs.add("+mask");
        return this;
    }

    public IMOps mask() {
        this.iCmdArgs.add("-mask");
        return this;
    }

    public IMOps mask(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-mask");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps mattecolor() {
        this.iCmdArgs.add("-mattecolor");
        return this;
    }

    public IMOps mattecolor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-mattecolor");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps median() {
        this.iCmdArgs.add("-median");
        return this;
    }

    public IMOps median(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-median");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps metric() {
        this.iCmdArgs.add("-metric");
        return this;
    }

    public IMOps metric(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-metric");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps mode() {
        this.iCmdArgs.add("-mode");
        return this;
    }

    public IMOps mode(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-mode");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps modulate() {
        this.iCmdArgs.add("-modulate");
        return this;
    }

    public IMOps modulate(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-modulate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps modulate(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-modulate");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps modulate(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-modulate");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(",");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps monitor() {
        this.iCmdArgs.add("-monitor");
        return this;
    }

    public IMOps monochrome() {
        this.iCmdArgs.add("-monochrome");
        return this;
    }

    public IMOps morph() {
        this.iCmdArgs.add("-morph");
        return this;
    }

    public IMOps morph(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-morph");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps morphology() {
        this.iCmdArgs.add("-morphology");
        return this;
    }

    public IMOps morphology(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-morphology");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps morphology(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-morphology");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps mosaic() {
        this.iCmdArgs.add("-mosaic");
        return this;
    }

    public IMOps motionBlur() {
        this.iCmdArgs.add("-motion-blur");
        return this;
    }

    public IMOps motionBlur(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-motion-blur");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps motionBlur(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-motion-blur");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps motionBlur(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-motion-blur");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3 < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps name() {
        this.iCmdArgs.add("-name");
        return this;
    }

    public IMOps negate() {
        this.iCmdArgs.add("-negate");
        return this;
    }

    public IMOps p_negate() {
        this.iCmdArgs.add("+negate");
        return this;
    }

    public IMOps noise() {
        this.iCmdArgs.add("-noise");
        return this;
    }

    public IMOps noise(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-noise");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_noise() {
        this.iCmdArgs.add("+noise");
        return this;
    }

    public IMOps p_noise(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+noise");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps normalize() {
        this.iCmdArgs.add("-normalize");
        return this;
    }

    public IMOps opaque() {
        this.iCmdArgs.add("-opaque");
        return this;
    }

    public IMOps opaque(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-opaque");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_opaque() {
        this.iCmdArgs.add("+opaque");
        return this;
    }

    public IMOps p_opaque(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+opaque");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps orderedDither() {
        this.iCmdArgs.add("-ordered-dither");
        return this;
    }

    public IMOps orderedDither(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-ordered-dither");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps orderedDither(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-ordered-dither");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps orient() {
        this.iCmdArgs.add("-orient");
        return this;
    }

    public IMOps orient(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-orient");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_page() {
        this.iCmdArgs.add("+page");
        return this;
    }

    public IMOps page() {
        this.iCmdArgs.add("-page");
        return this;
    }

    public IMOps page(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-page");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps page(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-page");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps page(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-page");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps page(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-page");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps page(Integer var1, Integer var2, Integer var3, Integer var4, Character var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-page");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps page(Integer var1, Integer var2, Integer var3, Integer var4, String var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-page");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps paint() {
        this.iCmdArgs.add("-paint");
        return this;
    }

    public IMOps paint(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-paint");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps path() {
        this.iCmdArgs.add("-path");
        return this;
    }

    public IMOps path(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-path");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps passphrase() {
        this.iCmdArgs.add("-passphrase");
        return this;
    }

    public IMOps passphrase(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-passphrase");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps pause() {
        this.iCmdArgs.add("-pause");
        return this;
    }

    public IMOps pause(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-pause");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps perceptible() {
        this.iCmdArgs.add("-perceptible");
        return this;
    }

    public IMOps perceptible(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-perceptible");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps ping() {
        this.iCmdArgs.add("-ping");
        return this;
    }

    public IMOps pointsize() {
        this.iCmdArgs.add("-pointsize");
        return this;
    }

    public IMOps pointsize(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-pointsize");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps polaroid() {
        this.iCmdArgs.add("-polaroid");
        return this;
    }

    public IMOps polaroid(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-polaroid");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_polaroid() {
        this.iCmdArgs.add("+polaroid");
        return this;
    }

    public IMOps poly() {
        this.iCmdArgs.add("-poly");
        return this;
    }

    public IMOps poly(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-poly");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps posterize() {
        this.iCmdArgs.add("-posterize");
        return this;
    }

    public IMOps posterize(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-posterize");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps precision() {
        this.iCmdArgs.add("-precision");
        return this;
    }

    public IMOps precision(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-precision");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps preview() {
        this.iCmdArgs.add("-preview");
        return this;
    }

    public IMOps preview(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-preview");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps print() {
        this.iCmdArgs.add("-print");
        return this;
    }

    public IMOps print(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-print");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps process() {
        this.iCmdArgs.add("-process");
        return this;
    }

    public IMOps process(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-process");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps profile() {
        this.iCmdArgs.add("-profile");
        return this;
    }

    public IMOps profile(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-profile");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_profile() {
        this.iCmdArgs.add("+profile");
        return this;
    }

    public IMOps p_profile(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+profile");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps quality() {
        this.iCmdArgs.add("-quality");
        return this;
    }

    public IMOps quality(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-quality");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps quantize() {
        this.iCmdArgs.add("-quantize");
        return this;
    }

    public IMOps quantize(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-quantize");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps quiet() {
        this.iCmdArgs.add("-quiet");
        return this;
    }

    public IMOps radialBlur() {
        this.iCmdArgs.add("-radial-blur");
        return this;
    }

    public IMOps radialBlur(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-radial-blur");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps raise() {
        this.iCmdArgs.add("-raise");
        return this;
    }

    public IMOps raise(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-raise");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps raise(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-raise");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_raise() {
        this.iCmdArgs.add("+raise");
        return this;
    }

    public IMOps p_raise(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+raise");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_raise(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("+raise");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps randomThreshold() {
        this.iCmdArgs.add("-random-threshold");
        return this;
    }

    public IMOps randomThreshold(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-random-threshold");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps randomThreshold(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-random-threshold");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps randomThreshold(Double var1, Double var2, Boolean var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-random-threshold");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var5.append("%");
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps recolor() {
        this.iCmdArgs.add("-recolor");
        return this;
    }

    public IMOps recolor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-recolor");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps redPrimary() {
        this.iCmdArgs.add("-red-primary");
        return this;
    }

    public IMOps redPrimary(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-red-primary");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps redPrimary(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-red-primary");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps regardWarnings() {
        this.iCmdArgs.add("-regard-warnings");
        return this;
    }

    public IMOps region() {
        this.iCmdArgs.add("-region");
        return this;
    }

    public IMOps region(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-region");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps region(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-region");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps region(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-region");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps region(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-region");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps p_remap() {
        this.iCmdArgs.add("+remap");
        return this;
    }

    public IMOps remap() {
        this.iCmdArgs.add("-remap");
        return this;
    }

    public IMOps remap(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-remap");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps remote() {
        this.iCmdArgs.add("-remote");
        return this;
    }

    public IMOps render() {
        this.iCmdArgs.add("-render");
        return this;
    }

    public IMOps p_render() {
        this.iCmdArgs.add("+render");
        return this;
    }

    public IMOps p_repage() {
        this.iCmdArgs.add("+repage");
        return this;
    }

    public IMOps repage() {
        this.iCmdArgs.add("-repage");
        return this;
    }

    public IMOps repage(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-repage");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps repage(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-repage");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps repage(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-repage");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps repage(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-repage");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps resample() {
        this.iCmdArgs.add("-resample");
        return this;
    }

    public IMOps resample(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-resample");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps resample(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-resample");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps resize() {
        this.iCmdArgs.add("-resize");
        return this;
    }

    public IMOps resize(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-resize");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps resize(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-resize");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps resize(Integer var1, Integer var2, Character var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-resize");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps resize(Integer var1, Integer var2, String var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-resize");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps respectParentheses() {
        this.iCmdArgs.add("-respect-parentheses");
        return this;
    }

    public IMOps respectParenthesis() {
        this.iCmdArgs.add("-respect-parenthesis");
        return this;
    }

    public IMOps reverse() {
        this.iCmdArgs.add("-reverse");
        return this;
    }

    public IMOps roll() {
        this.iCmdArgs.add("-roll");
        return this;
    }

    public IMOps roll(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-roll");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps roll(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-roll");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            String var3 = "+";
            if (var2.doubleValue() < 0.0) {
                var3 = "";
            }

            var4.append(var3);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps rotate() {
        this.iCmdArgs.add("-rotate");
        return this;
    }

    public IMOps rotate(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-rotate");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps rotate(Double var1, Character var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-rotate");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 == null && var2 != null) {
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps sample() {
        this.iCmdArgs.add("-sample");
        return this;
    }

    public IMOps sample(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-sample");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps sample(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-sample");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps sample(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-sample");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps sample(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-sample");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps samplingFactor() {
        this.iCmdArgs.add("-sampling-factor");
        return this;
    }

    public IMOps samplingFactor(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-sampling-factor");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps samplingFactor(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-sampling-factor");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps selectiveBlur() {
        this.iCmdArgs.add("-selective-blur");
        return this;
    }

    public IMOps selectiveBlur(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-selective-blur");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps selectiveBlur(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-selective-blur");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps selectiveBlur(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-selective-blur");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3 < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps sparseColor() {
        this.iCmdArgs.add("-sparse-color");
        return this;
    }

    public IMOps sparseColor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-sparse-color");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps sparseColor(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-sparse-color");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps scale() {
        this.iCmdArgs.add("-scale");
        return this;
    }

    public IMOps scale(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-scale");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps scale(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-scale");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps scale(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-scale");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps scale(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-scale");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps scene() {
        this.iCmdArgs.add("-scene");
        return this;
    }

    public IMOps scene(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-scene");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps screen() {
        this.iCmdArgs.add("-screen");
        return this;
    }

    public IMOps seed() {
        this.iCmdArgs.add("-seed");
        return this;
    }

    public IMOps segment() {
        this.iCmdArgs.add("-segment");
        return this;
    }

    public IMOps segment(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-segment");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps segment(Integer var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-segment");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps separate() {
        this.iCmdArgs.add("-separate");
        return this;
    }

    public IMOps sepiaTone() {
        this.iCmdArgs.add("-sepia-tone");
        return this;
    }

    public IMOps sepiaTone(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-sepia-tone");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps set() {
        this.iCmdArgs.add("-set");
        return this;
    }

    public IMOps set(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-set");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps set(String var1, String var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-set");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps shade() {
        this.iCmdArgs.add("-shade");
        return this;
    }

    public IMOps shade(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-shade");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps shade(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-shade");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_shade() {
        this.iCmdArgs.add("+shade");
        return this;
    }

    public IMOps p_shade(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+shade");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_shade(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("+shade");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps shadow() {
        this.iCmdArgs.add("-shadow");
        return this;
    }

    public IMOps shadow(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-shadow");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps shadow(Integer var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-shadow");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps shadow(Integer var1, Double var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-shadow");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps shadow(Integer var1, Double var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-shadow");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps shadow(Integer var1, Double var2, Integer var3, Integer var4, Boolean var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-shadow");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null && var5) {
            var7.append("%");
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps sharedMemory() {
        this.iCmdArgs.add("-shared-memory");
        return this;
    }

    public IMOps sharpen() {
        this.iCmdArgs.add("-sharpen");
        return this;
    }

    public IMOps sharpen(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-sharpen");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps sharpen(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-sharpen");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps shave() {
        this.iCmdArgs.add("-shave");
        return this;
    }

    public IMOps shave(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-shave");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps shave(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-shave");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps shave(Integer var1, Integer var2, Boolean var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-shave");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null && var3) {
            var5.append("%");
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps shear() {
        this.iCmdArgs.add("-shear");
        return this;
    }

    public IMOps shear(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-shear");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps shear(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-shear");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps sigmoidalContrast() {
        this.iCmdArgs.add("-sigmoidal-contrast");
        return this;
    }

    public IMOps sigmoidalContrast(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-sigmoidal-contrast");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps sigmoidalContrast(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-sigmoidal-contrast");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps p_sigmoidalContrast() {
        this.iCmdArgs.add("+sigmoidal-contrast");
        return this;
    }

    public IMOps p_sigmoidalContrast(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+sigmoidal-contrast");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_sigmoidalContrast(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("+sigmoidal-contrast");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps silent() {
        this.iCmdArgs.add("-silent");
        return this;
    }

    public IMOps size() {
        this.iCmdArgs.add("-size");
        return this;
    }

    public IMOps size(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-size");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps size(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-size");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps size(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-size");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps sketch() {
        this.iCmdArgs.add("-sketch");
        return this;
    }

    public IMOps sketch(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-sketch");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps sketch(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-sketch");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps sketch(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-sketch");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3 < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps smush() {
        this.iCmdArgs.add("-smush");
        return this;
    }

    public IMOps smush(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-smush");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps snaps() {
        this.iCmdArgs.add("-snaps");
        return this;
    }

    public IMOps snaps(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-snaps");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps solarize() {
        this.iCmdArgs.add("-solarize");
        return this;
    }

    public IMOps solarize(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-solarize");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps splice() {
        this.iCmdArgs.add("-splice");
        return this;
    }

    public IMOps splice(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-splice");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps splice(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-splice");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps splice(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-splice");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3 < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps splice(Double var1, Double var2, Double var3, Double var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-splice");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3 < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4 < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps splice(Double var1, Double var2, Double var3, Double var4, Boolean var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-splice");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3 < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4 < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null && var5) {
            var7.append("%");
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps spread() {
        this.iCmdArgs.add("-spread");
        return this;
    }

    public IMOps spread(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-spread");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps stegano() {
        this.iCmdArgs.add("-stegano");
        return this;
    }

    public IMOps stegano(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-stegano");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps stereo() {
        this.iCmdArgs.add("-stereo");
        return this;
    }

    public IMOps stereo(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-stereo");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps stereo(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-stereo");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            String var3 = "+";
            if (var2.doubleValue() < 0.0) {
                var3 = "";
            }

            var4.append(var3);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps statistic() {
        this.iCmdArgs.add("-statistic");
        return this;
    }

    public IMOps statistic(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-statistic");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps statistic(String var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-statistic");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var4.toString());
            var4.setLength(0);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps statistic(String var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-statistic");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var5.toString());
            var5.setLength(0);
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append("x");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps statistic(String var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-statistic");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var6.toString());
            var6.setLength(0);
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var6.append("x");
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            String var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps statistic(String var1, Integer var2, Integer var3, Integer var4, Integer var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-statistic");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var7.toString());
            var7.setLength(0);
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var7.append("x");
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        String var6;
        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var6 = "+";
            if (var5.doubleValue() < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var5 != null) {
            var7.append(var5.toString());
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps statistic(String var1, Integer var2, Integer var3, Integer var4, Integer var5, String var6) {
        StringBuffer var8 = new StringBuffer();
        this.iCmdArgs.add("-statistic");
        if (var1 != null) {
            var8.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            this.iCmdArgs.add(var8.toString());
            var8.setLength(0);
        }

        if (var2 != null) {
            var8.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var8.append("x");
        }

        if (var3 != null) {
            var8.append(var3.toString());
        }

        String var7;
        if (var3 != null || var4 != null) {
            var7 = "+";
            if (var4.doubleValue() < 0.0) {
                var7 = "";
            }

            var8.append(var7);
        }

        if (var4 != null) {
            var8.append(var4.toString());
        }

        if (var4 != null || var5 != null) {
            var7 = "+";
            if (var5.doubleValue() < 0.0) {
                var7 = "";
            }

            var8.append(var7);
        }

        if (var5 != null) {
            var8.append(var5.toString());
        }

        if (var5 == null && var6 != null) {
        }

        if (var6 != null) {
            var8.append(var6.toString());
        }

        if (var8.length() > 0) {
            this.iCmdArgs.add(var8.toString());
        }

        return this;
    }

    public IMOps storageType() {
        this.iCmdArgs.add("-storage-type");
        return this;
    }

    public IMOps storageType(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-storage-type");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps stretch() {
        this.iCmdArgs.add("-stretch");
        return this;
    }

    public IMOps stretch(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-stretch");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps strip() {
        this.iCmdArgs.add("-strip");
        return this;
    }

    public IMOps stroke() {
        this.iCmdArgs.add("-stroke");
        return this;
    }

    public IMOps stroke(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-stroke");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps strokewidth() {
        this.iCmdArgs.add("-strokewidth");
        return this;
    }

    public IMOps strokewidth(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-strokewidth");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps style() {
        this.iCmdArgs.add("-style");
        return this;
    }

    public IMOps style(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-style");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps subimageSearch() {
        this.iCmdArgs.add("-subimage-search");
        return this;
    }

    public IMOps p_swap() {
        this.iCmdArgs.add("+swap");
        return this;
    }

    public IMOps swap() {
        this.iCmdArgs.add("-swap");
        return this;
    }

    public IMOps swap(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-swap");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps swap(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-swap");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps swirl() {
        this.iCmdArgs.add("-swirl");
        return this;
    }

    public IMOps swirl(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-swirl");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps synchronize() {
        this.iCmdArgs.add("-synchronize");
        return this;
    }

    public IMOps taint() {
        this.iCmdArgs.add("-taint");
        return this;
    }

    public IMOps textFont() {
        this.iCmdArgs.add("-text-font");
        return this;
    }

    public IMOps textFont(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-text-font");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps texture() {
        this.iCmdArgs.add("-texture");
        return this;
    }

    public IMOps texture(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-texture");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps threshold() {
        this.iCmdArgs.add("-threshold");
        return this;
    }

    public IMOps threshold(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-threshold");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps threshold(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-threshold");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps threshold(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-threshold");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append(",");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var5.append(",");
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps threshold(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-threshold");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append(",");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var6.append(",");
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6.append(",");
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps threshold(Integer var1, Integer var2, Integer var3, Integer var4, Boolean var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-threshold");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append(",");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            var7.append(",");
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var7.append(",");
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null && var5) {
            var7.append("%");
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps thumbnail() {
        this.iCmdArgs.add("-thumbnail");
        return this;
    }

    public IMOps thumbnail(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-thumbnail");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps thumbnail(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-thumbnail");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps thumbnail(Integer var1, Integer var2, Character var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-thumbnail");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps thumbnail(Integer var1, Integer var2, String var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-thumbnail");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 == null && var3 != null) {
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps tile() {
        this.iCmdArgs.add("-tile");
        return this;
    }

    public IMOps tile(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-tile");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps tile(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-tile");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps tile(Integer var1, Integer var2, Integer var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-tile");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3.doubleValue() < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps tile(Integer var1, Integer var2, Integer var3, Integer var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-tile");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4.doubleValue() < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps tileOffset() {
        this.iCmdArgs.add("-tile-offset");
        return this;
    }

    public IMOps tileOffset(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-tile-offset");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps tileOffset(Integer var1, Integer var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-tile-offset");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            String var3 = "+";
            if (var2.doubleValue() < 0.0) {
                var3 = "";
            }

            var4.append(var3);
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps tile(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-tile");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps tint() {
        this.iCmdArgs.add("-tint");
        return this;
    }

    public IMOps tint(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-tint");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps title() {
        this.iCmdArgs.add("-title");
        return this;
    }

    public IMOps title(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-title");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps transform() {
        this.iCmdArgs.add("-transform");
        return this;
    }

    public IMOps transparentColor() {
        this.iCmdArgs.add("-transparent-color");
        return this;
    }

    public IMOps transparentColor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-transparent-color");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps transparent() {
        this.iCmdArgs.add("-transparent");
        return this;
    }

    public IMOps transparent(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-transparent");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps transpose() {
        this.iCmdArgs.add("-transpose");
        return this;
    }

    public IMOps transverse() {
        this.iCmdArgs.add("-transverse");
        return this;
    }

    public IMOps treedepth() {
        this.iCmdArgs.add("-treedepth");
        return this;
    }

    public IMOps treedepth(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-treedepth");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps trim() {
        this.iCmdArgs.add("-trim");
        return this;
    }

    public IMOps type() {
        this.iCmdArgs.add("-type");
        return this;
    }

    public IMOps type(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-type");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps undercolor() {
        this.iCmdArgs.add("-undercolor");
        return this;
    }

    public IMOps undercolor(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-undercolor");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps uniqueColors() {
        this.iCmdArgs.add("-unique-colors");
        return this;
    }

    public IMOps units() {
        this.iCmdArgs.add("-units");
        return this;
    }

    public IMOps units(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-units");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps unsharp() {
        this.iCmdArgs.add("-unsharp");
        return this;
    }

    public IMOps unsharp(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-unsharp");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps unsharp(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-unsharp");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps unsharp(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-unsharp");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3 < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps unsharp(Double var1, Double var2, Double var3, Double var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-unsharp");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3 < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4 < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps update() {
        this.iCmdArgs.add("-update");
        return this;
    }

    public IMOps update(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-update");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps verbose() {
        this.iCmdArgs.add("-verbose");
        return this;
    }

    public IMOps version() {
        this.iCmdArgs.add("-version");
        return this;
    }

    public IMOps view() {
        this.iCmdArgs.add("-view");
        return this;
    }

    public IMOps view(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-view");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps vignette() {
        this.iCmdArgs.add("-vignette");
        return this;
    }

    public IMOps vignette(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-vignette");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps vignette(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-vignette");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps vignette(Double var1, Double var2, Double var3) {
        StringBuffer var5 = new StringBuffer();
        this.iCmdArgs.add("-vignette");
        if (var1 != null) {
            var5.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var5.append("x");
        }

        if (var2 != null) {
            var5.append(var2.toString());
        }

        if (var2 != null || var3 != null) {
            String var4 = "+";
            if (var3 < 0.0) {
                var4 = "";
            }

            var5.append(var4);
        }

        if (var3 != null) {
            var5.append(var3.toString());
        }

        if (var5.length() > 0) {
            this.iCmdArgs.add(var5.toString());
        }

        return this;
    }

    public IMOps vignette(Double var1, Double var2, Double var3, Double var4) {
        StringBuffer var6 = new StringBuffer();
        this.iCmdArgs.add("-vignette");
        if (var1 != null) {
            var6.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var6.append("x");
        }

        if (var2 != null) {
            var6.append(var2.toString());
        }

        String var5;
        if (var2 != null || var3 != null) {
            var5 = "+";
            if (var3 < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var3 != null) {
            var6.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var5 = "+";
            if (var4 < 0.0) {
                var5 = "";
            }

            var6.append(var5);
        }

        if (var4 != null) {
            var6.append(var4.toString());
        }

        if (var6.length() > 0) {
            this.iCmdArgs.add(var6.toString());
        }

        return this;
    }

    public IMOps vignette(Double var1, Double var2, Double var3, Double var4, Boolean var5) {
        StringBuffer var7 = new StringBuffer();
        this.iCmdArgs.add("-vignette");
        if (var1 != null) {
            var7.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var7.append("x");
        }

        if (var2 != null) {
            var7.append(var2.toString());
        }

        String var6;
        if (var2 != null || var3 != null) {
            var6 = "+";
            if (var3 < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var3 != null) {
            var7.append(var3.toString());
        }

        if (var3 != null || var4 != null) {
            var6 = "+";
            if (var4 < 0.0) {
                var6 = "";
            }

            var7.append(var6);
        }

        if (var4 != null) {
            var7.append(var4.toString());
        }

        if (var4 == null && var5 != null) {
        }

        if (var5 != null && var5) {
            var7.append("%");
        }

        if (var7.length() > 0) {
            this.iCmdArgs.add(var7.toString());
        }

        return this;
    }

    public IMOps virtualPixel() {
        this.iCmdArgs.add("-virtual-pixel");
        return this;
    }

    public IMOps virtualPixel(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-virtual-pixel");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps visual() {
        this.iCmdArgs.add("-visual");
        return this;
    }

    public IMOps visual(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-visual");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps watermark() {
        this.iCmdArgs.add("-watermark");
        return this;
    }

    public IMOps watermark(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-watermark");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps wave() {
        this.iCmdArgs.add("-wave");
        return this;
    }

    public IMOps wave(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-wave");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps wave(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-wave");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append("x");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps weight() {
        this.iCmdArgs.add("-weight");
        return this;
    }

    public IMOps weight(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-weight");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps weight(Integer var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-weight");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps whitePoint() {
        this.iCmdArgs.add("-white-point");
        return this;
    }

    public IMOps whitePoint(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-white-point");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps whitePoint(Double var1, Double var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-white-point");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 != null || var2 != null) {
            var4.append(",");
        }

        if (var2 != null) {
            var4.append(var2.toString());
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps whiteThreshold() {
        this.iCmdArgs.add("-white-threshold");
        return this;
    }

    public IMOps whiteThreshold(Double var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-white-threshold");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps whiteThreshold(Double var1, Boolean var2) {
        StringBuffer var4 = new StringBuffer();
        this.iCmdArgs.add("-white-threshold");
        if (var1 != null) {
            var4.append(var1.toString());
        }

        if (var1 == null && var2 != null) {
        }

        if (var2 != null && var2) {
            var4.append("%");
        }

        if (var4.length() > 0) {
            this.iCmdArgs.add(var4.toString());
        }

        return this;
    }

    public IMOps windowGroup() {
        this.iCmdArgs.add("-window-group");
        return this;
    }

    public IMOps window() {
        this.iCmdArgs.add("-window");
        return this;
    }

    public IMOps window(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-window");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps write() {
        this.iCmdArgs.add("-write");
        return this;
    }

    public IMOps write(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("-write");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }

    public IMOps p_write() {
        this.iCmdArgs.add("+write");
        return this;
    }

    public IMOps p_write(String var1) {
        StringBuffer var3 = new StringBuffer();
        this.iCmdArgs.add("+write");
        if (var1 != null) {
            var3.append(var1.toString());
        }

        if (var3.length() > 0) {
            this.iCmdArgs.add(var3.toString());
        }

        return this;
    }
}
