#(loop [xs [1 1] counter 2] (if (= % (count xs)) xs (recur (conj xs (+ (last xs) (nth xs (- (count xs) 2)))) (inc counter))))
