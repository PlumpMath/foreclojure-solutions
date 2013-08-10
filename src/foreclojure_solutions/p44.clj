(ns foreclojure-solutions.p44
  (:use midje.sweet))

(defn rotseq [n coll]
  ( let [ rots (mod (abs n) (count coll))]
    ( if (pos? n)
      (concat (drop rots coll) (take rots coll))
      (concat (drop (- (count coll) rots ) coll) 
              (take (- (count coll) rots ) coll)))))


(fn [n coll]
  ( let [ rots (mod (#(if (neg? %)(- %) %) n) (count coll))]
    ( if (pos? n)
      (concat (drop rots coll) (take rots coll))
      (concat (drop (- (count coll) rots ) coll) 
              (take (- (count coll) rots ) coll)))))

(defn abs [x] 
  "returns the absolute value of x"
  (if (neg? x)(- x) x))

#(if (neg? %)(- %) %)



(rotseq 2 [1 2 3 4 5])
(rotseq -2 [1 2 3 4 5])
(rotseq 6 [1 2 3 4 5])
(rotseq 1 '(:a :b :c))
(rotseq -4 '(:a :b :c))

(future-fact "Rotate Sequence"
  (rotseq 2 [1 2 3 4 5]) => '(3 4 5 1 2)
  (rotseq -2 [1 2 3 4 5]) => '(4 5 1 2 3)
  (rotseq 6 [1 2 3 4 5]) => '(2 3 4 5 1)
  (rotseq 1 '(:a :b :c)) => '(:b :c :a)
  (rotseq -4 '(:a :b :c)) => '(:c :a :b))


;; take the first n and conj to rear

;;-4  (:a :b :c) -> (:c :a :b) -> (:b :c :a) -> (:a :b :c) -> (:c :a :b)  

;; Others' solutions:

;; austintaylor's
(fn [n s]
  (let [[a b] (split-at (mod n (count s)) s)]
    (concat b a)))

;;dwelte's
(fn flip [n xs]
  (let [[x y] (split-at (mod n (count xs)) xs)] (concat y x)))

;;amcnamara's
#(let [c (count %2) 
       n (mod (if (neg? %) (+ c %) %) c)]
  (concat (drop n %2) (take n %2)))

;; darren's
#(let [c (count %2) p (mod % c)]
   (concat (drop p %2) (take p %2)))

;; silverio's
#(let [c (count %2)] (->> %2 
    (concat %2 %2) 
    (drop (+ c (mod % c)))
    (take c)))

;; jbear's
#(let [[x y] (split-at (mod %1 (count %2)) %2)] `(~@y ~@x))