class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        alphabet=set()
        for i in range (97,123,1):
            alphabet.add(chr(i))
        sentence=sentence.lower()    
        sentence=set(sentence)
        if alphabet<=sentence:
            return True
        else:
            return False