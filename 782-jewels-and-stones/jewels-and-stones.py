class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        #jewels_set=set(jewels)
        count=0
        for ch in stones:
            if ch in jewels:
                count+=1
                #print(ch)
        
        return count
        