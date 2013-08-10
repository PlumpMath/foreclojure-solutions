(ns foreclojure-solutions.p34
  (:use midje.sweet))


(comment (defn __b [x y]
           "Takes two args and returns a range"
           (loop [r [x]]
             (while (<= x y)
               (recur
                (concat r (vector (inc (last r)))))))))

(defn __ [x y]
  "Takes two args and returns a range"
  (take (- y x) (iterate inc x )))

(fact "Implement range"
  (__ 1 4) => '(1 2 3)
  (__ -2 2) => '(-2 -1 0 1)
  (__ 5 8) => '(5 6 7))

(defn incvec [v1]
  (let [r v1]
  "Increments a given vector"
  (concat r (vector (inc (last r))))))
