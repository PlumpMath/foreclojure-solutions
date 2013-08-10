(ns foreclojure-solutions.p96
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Beauty is Symmetry"
  (__ '(:a (:b nil nil) (:b nil nil))) => true
  (__ '(:a (:b nil nil) nil)) => false
  (__ '(:a (:b nil nil) (:c nil nil))) => false
  (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
            [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]]) => true
  (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
            [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]]) => false
  (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
            [2 [3 nil [4 [6 nil nil] nil]] nil]]) => false)
