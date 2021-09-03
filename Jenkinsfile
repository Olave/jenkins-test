pipeline {
  agent any
  stages {
    stage('stage 1') {
      steps {
        bat 'echo 11'
      }
    }

    stage('stage2') {
      steps {
        bat 'echo 2'
      }
    }

    stage('DingDingNotice') {
      agent any
      steps {
        dingtalk(robot: 'JenkinsDingTalk', picUrl: 'https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=5&spn=0&di=188540&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=1070003001%2C653753576&os=1632714778%2C3526303815&simid=4097301181%2C632893554&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=%E5%9B%BE%E7%89%87&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fphotoblog%2F1309%2F25%2Fc49%2F26316176_26316176_1380092693834_mthumb.jpg%26refer%3Dhttp%3A%2F%2Fimg.pconline.com.cn%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1633229254%26t%3Dcc8eca42b49dc15dd74a8fe7586e2e56&fromurl=ippr_z2C%24qAzdH3FAzdH3F1r_z%26e3Brv5gstgj_z%26e3Bv54_z%26e3BvgAzdH3Fri5p5AzdH3Fstfp_d0cdll8_z%26e3Bip4s&gsm=2&islist=&querylist=')
      }
    }

  }
  environment {
    a = '122'
  }
}