public class StockSell {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int BB=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>BB){
                maxP=Math.max(maxP,prices[i]-BB);
            }
            BB=Math.min(BB,prices[i]);
        }
        return maxP;
    }
}
