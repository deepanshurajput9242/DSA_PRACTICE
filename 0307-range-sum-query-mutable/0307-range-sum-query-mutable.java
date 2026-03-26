class NumArray {

    int[] segTree;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        segTree = new int[4 * n];
        build(nums, 0, 0, n - 1);
    }

   
    private void build(int[] nums, int i, int l, int r) {
        if (l == r) {
            segTree[i] = nums[l];
            return;
        }
        int mid = (l + r) / 2;
        build(nums, 2*i+1, l, mid);
        build(nums, 2*i+2, mid+1, r);
        segTree[i] = segTree[2*i+1] + segTree[2*i+2];
    }

    public void update(int index, int val, int i, int l, int r) {
        if (l == r) {
            segTree[i] = val;
            return;
        }
        int mid = (l + r) / 2;

        if (index <= mid) {
            update(index, val, 2*i+1, l, mid);  
        } else {
            update(index, val, 2*i+2, mid+1, r); 
        }

        segTree[i] = segTree[2*i+1] + segTree[2*i+2];
    }

  
    public void update(int index, int val) {
        update(index, val, 0, 0, n-1);
    }

 
    public int sumRange(int start, int end, int idx, int l, int r) {

     
        if (r < start || l > end) return 0;

        if (l >= start && r <= end) return segTree[idx];

        int mid = (l + r) / 2;

        return sumRange(start, end, 2*idx+1, l, mid)   
             + sumRange(start, end, 2*idx+2, mid+1, r);
    }

    
    public int sumRange(int left, int right) {
        return sumRange(left, right, 0, 0, n-1);
    }
}