package com.amazon;

public class TrappingRainWater {
	public int trap(int[] height) {
        int peak = 0;
        int max = 0;

        // Step 1: Find the peak index (highest bar)
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i]; // 7th idex is the most max or highest
                System.out.println("Max"+" "+max);
                peak = i; // so peak will be 7
                System.out.println("Max"+" "+peak);
            }
        }

        int total = 0;
        int leftMax = 0;

        System.out.println("Left to peak trapping:");
        System.out.println("peak"+" "+peak);
        for (int i = 0; i < peak; i++) {
            if (height[i] >= leftMax) {
                leftMax = height[i];
                System.out.println("Left-Max"+" "+leftMax);
            } else {
                int trapped = leftMax - height[i];
                total += trapped;
                System.out.println("Index " + i + ": Trapped " + trapped);
            }
        }

        int rightMax = 0;

        System.out.println("Right to peak trapping:");
        for (int i = height.length - 1; i > peak; i--) {
            if (height[i] >= rightMax) {
                rightMax = height[i];
                System.out.println("Right-Max"+" "+rightMax+ " *"+i);
            } else {
                int trapped = rightMax - height[i];
                total += trapped;
                System.out.println("Index " + i + ": Trapped " + trapped);
            }
        }

        return total;
    }

    // Main method for testing
    public static void main(String[] args) {
    	TrappingRainWater solution = new TrappingRainWater();

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = solution.trap(height);

        System.out.println("Total water trapped: " + result);
    }
}
