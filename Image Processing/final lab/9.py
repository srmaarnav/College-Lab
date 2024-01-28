## power law transformation

import cv2
import numpy as np

img = cv2.imread('./final lab/2.jpg')
gamma = 0.6
s = np.array(255 * (img / 255) ** gamma, dtype='uint8')

cv2.imshow("Original Image", img)
cv2.imshow("Gamma Corrected Image", s)
cv2.waitKey(0)
cv2.destroyAllWindows()

