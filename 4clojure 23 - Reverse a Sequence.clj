#(loop [xs % inverted-seq []] (if (empty? xs) inverted-seq (recur (rest xs) (into [(first xs)] inverted-seq))))
