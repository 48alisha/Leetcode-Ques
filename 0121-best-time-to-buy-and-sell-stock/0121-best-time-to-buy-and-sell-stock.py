class Solution(object):
    def maxProfit(self, prices):
     min_price=prices[0]
     maxprofit=0
     for price in prices:
        min_price=min(price,min_price)
        profit=price-min_price
        maxprofit=max(maxprofit,profit)

     return maxprofit
