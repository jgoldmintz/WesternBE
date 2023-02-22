#Verifies that the imagemagick command line tool is installed and up to date (Unix/Linux)
if ! which "$magick" /usr/bin/magick
then
  tar -xvzf ImageMagick-x86_64-apple-darwin20.1.0.tar.gz
fi

#changes the path of the bin files
cd ImageMagick-7.0.10
mkdir ~/imageMagick/bin
mv /bin/* ~/imageMagick/bin
chmod +x ~/imageMagick/bin/*
if ! grep 'PATH=.*/usr/bin' ~/.profile
then
    echo 'export PATH=".*/usr/bin:$PATH"' >> ~/.profile
fi
. ~/.profile

#Changes the path of the lib files

mkdir ~/imageMagick/lib
mv /lib/* ~/imageMagick/lib
chmod +x ~/imageMagick/lib/*
if ! grep 'PATH=.*/usr/lib' ~/.profile
then
    echo 'export PATH=".*/usr/lib:$PATH"' >> ~/.profile
fi
. ~/.profile
