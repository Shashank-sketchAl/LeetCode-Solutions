class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """

        # Dictionary to store the last seen index of characters
        char_index = {}

        # Left pointer of the sliding window
        left = 0

        # Variable to keep track of maximum length
        max_len = 0

        # Iterate through characters in the string
        for right, ch in enumerate(s):
            # If character already seen and inside current window
            if ch in char_index and char_index[ch] >= left:
                left = char_index[ch] + 1   # move left pointer ahead

            # Update last seen index of current character
            char_index[ch] = right

            # Update max length of substring
            max_len = max(max_len, right - left + 1)

        return max_len
