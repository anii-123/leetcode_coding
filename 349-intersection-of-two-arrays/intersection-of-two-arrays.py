class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        l=[]
        #count=0
        for i in range(len(nums1)):
            count=0
            for j in range(0,len(nums2)):
                if nums1[i]==nums2[j]:
                    count+=1
            if count>0 and nums1[i] not in l:
            #if count==0:
                l.append(nums1[i])
        return(l)

        