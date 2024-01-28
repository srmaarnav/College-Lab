##digital negative

import cv2
import matplotlib.pyplot as plt

img = cv2.imread('./final lab/img2.png')
cv2.imshow('input image', img)

img_neg = 255 - img
cv2.imshow('output image', img_neg)

cv2.waitKey(0)
cv2.destroyAllWindows()
