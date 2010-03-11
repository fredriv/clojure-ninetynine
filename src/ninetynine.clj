(ns ninetynine)

(defn mylast 
	"Find the last element of the sequence"
	[l]
	(let [x (count l)]
	  (if (> x 0) 
  		(nth l (dec x)) 
  		nil)))

(defn mylast2
  [l]
  (loop [[head & tail] l]
		(if (nil? tail) head (recur tail))))
	
(defn penultimate
  [l]
  (let [x (count l)]
  (if (> x 1) 
  	(nth (reverse l) 1)
  	nil)))

(defn penultimate2
	[l]
	(loop [[h1 h2 & tail] l]
		(if (nil? h2)
			nil 
			(if (nil? tail) 
				h1 
				(recur (cons h2 tail))))))

(defn mynth
	[l idx]
	(loop [[head & tail] l
				 currentIdx 0]
		(if (= idx currentIdx)
	     head
	     (recur tail (inc currentIdx)))))
	     
(defn mylength
	[l]
	(if (empty? l)
		0
		(loop [[head & tail] l
	  	     len 1]
	  	(if (nil? tail) 
	    	len
	    	(recur tail (inc len))))))
	    	
def length (l: List) = l match {
  case Nil => 0
  case head : tail => 1 + length(tail)
}

(defn myreverse [l]
  (if (empty? l)
  	l
		(loop [[head & tail] l
		       res '()]
	  	(if (nil? tail)
	  		(cons head res)
	  		(recur tail (cons head res))))))
	  	
(defn myreverse2 [l]
  (loop [mylist l
		     res '()]
	  	(if (empty? mylist)
	  		res
	  		(recur (rest mylist) (cons (first mylist) res)))))
	  	
(defn palindrome? [l]
  (= (seq l) (myreverse2 l)))
  