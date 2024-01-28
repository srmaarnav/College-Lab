## histogram equalization

import cv2

# read an image using imread
img = cv2.imread('./final lab/2.jpg', 0)
cv2.imshow('input', img)

# creating a Histograms Equalization
# of an image using cv2.equalizeHist()
equ = cv2.equalizeHist(img)

# show image input vs output
cv2.imshow('output', equ)
cv2.waitKey(0)
cv2.destroyAllWindows()
