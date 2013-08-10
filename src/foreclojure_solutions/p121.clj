(ns foreclojure-solutions.p121
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Universal Computation Engine"
  2 => ((__ '(/ a b))
        '{b 8 a 16})
  8 => ((__ '(+ a b 2))
        '{a 2 b 4})
  [6 0 -4] => (map (__ '(* (+ 2 a)
    	              (- 10 b)))
  	        '[{a 1 b 8}
  	          {b 5 a -2}
  	          {a 2 b 11}])
  (= 1 ((__ '(/ (+ x 2)
                (* 3 (+ y 1))))
        '{x 4 y 1}))
   => true)
