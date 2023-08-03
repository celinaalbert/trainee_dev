//
//  ViewController.swift
//  button
//
//  Created by Celina on 01/08/23.
//

import UIKit

class ViewController: UIViewController {

    private let imageView : UIImageView = {
        let imageView = UIImageView()
        imageView.contentMode = .scaleAspectFit
        imageView.backgroundColor = .white
        return imageView
    }()
    
    let colors : [UIColor] = [
        .systemRed,
        .systemBlue,
        .systemCyan,
        .systemFill,
        .systemMint,
        .systemPink,
        .systemTeal,
        .systemBrown,
        .systemGreen,
        .systemOrange,
        .systemIndigo,
        .systemYellow
    ]
    
    private let button : UIButton = {
        let button = UIButton()
        button.backgroundColor = .white
        button.setTitle("Click Me", for: .normal)
        button.setTitleColor(.black, for: .normal)
        button.titleLabel?.font = .systemFont(ofSize: 30)
        button.layer.cornerRadius = 20
        return button
    }()
    
     @objc func didTapButton(){
        getRandomImage()
         view.backgroundColor = colors.randomElement()
    }
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        view.backgroundColor = .systemRed
        view.addSubview(imageView)
        view.addSubview(button)
        getRandomImage()
        button.addTarget(self, action: #selector(didTapButton), for: .touchUpInside)
    }
    
    override func viewDidLayoutSubviews() {
        super.viewDidLayoutSubviews()
        imageView.frame = CGRect(x: 0, y: 0, width: 300, height: 300)
        imageView.center = view.center
        button.frame = CGRect(x:70, y:view.frame.size.height-200-view.safeAreaInsets.bottom, width: view.frame.size.width-140, height: 60)
       

    }
    
    func getRandomImage() {
        let urlString = "https://source.unsplash.com/random/600x600"
        let url = URL(string:urlString)!
        guard let data = try? Data(contentsOf: url) else { return }
        imageView.image = UIImage(data: data)
    }
  

}

