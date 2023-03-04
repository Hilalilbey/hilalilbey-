{\rtf1\ansi\ansicpg1254\cocoartf2706
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red5\green0\blue168;\red234\green234\blue234;\red0\green0\blue0;
\red135\green135\blue135;\red210\green50\blue85;\red19\green136\blue27;\red135\green91\blue44;\red133\green0\blue67;
}
{\*\expandedcolortbl;;\cssrgb\c2745\c7843\c71765;\cssrgb\c93333\c93333\c93333;\cssrgb\c0\c0\c0;
\cssrgb\c60000\c60000\c60000;\cssrgb\c86667\c29020\c40784;\cssrgb\c1176\c58824\c14118;\cssrgb\c60392\c43137\c22745;\cssrgb\c60000\c0\c33333;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh15220\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs28 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf0 \cb3 \strokec4  \cb1 java\cf5 \strokec5 .\cf0 \strokec4 util\cf5 \strokec5 .\cf6 \strokec6 Scanner\cf5 \strokec5 ;\cf0 \cb3 \strokec4 \
\cf2 \cb1 \strokec2 public\cf0 \cb3 \strokec4  \cf2 \cb1 \strokec2 class\cf0 \cb3 \strokec4  \cf6 \cb1 \strokec6 Pyramid\cf5 \strokec5 \{\cf0 \cb3 \strokec4 \
   \cf2 \cb1 \strokec2 public\cf0 \cb3 \strokec4  \cf2 \cb1 \strokec2 static\cf0 \cb3 \strokec4  \cf2 \cb1 \strokec2 void\cf0 \cb3 \strokec4  \cf6 \cb1 \strokec6 main\cf5 \strokec5 (\cf6 \strokec6 String\cf0 \cb3 \strokec4  args\cf5 \cb1 \strokec5 [])\{\cf0 \cb3 \strokec4 \
      \cf2 \cb1 \strokec2 int\cf0 \cb3 \strokec4  i\cf5 \cb1 \strokec5 ,\cf0 \cb3 \strokec4  j\cf5 \cb1 \strokec5 ,\cf0 \cb3 \strokec4  my_input\cf5 \cb1 \strokec5 ;\cf0 \cb3 \strokec4 \
      \cf6 \cb1 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 out\cf5 \cb1 \strokec5 .\cf6 \strokec6 println\cf5 \strokec5 (\cf7 \strokec7 "Required packages have been imported"\cf5 \strokec5 );\cf0 \cb3 \strokec4 \
      \cf6 \cb1 \strokec6 Scanner\cf0 \cb3 \strokec4  my_scanner \cf8 \cb1 \strokec8 =\cf0 \cb3 \strokec4  \cf2 \cb1 \strokec2 new\cf0 \cb3 \strokec4  \cf6 \cb1 \strokec6 Scanner\cf5 \strokec5 (\cf6 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 in\cf5 \cb1 \strokec5 );\cf0 \cb3 \strokec4 \
      \cf6 \cb1 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 out\cf5 \cb1 \strokec5 .\cf6 \strokec6 println\cf5 \strokec5 (\cf7 \strokec7 "A reader object has been defined "\cf5 \strokec5 );\cf0 \cb3 \strokec4 \
      \cf6 \cb1 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 out\cf5 \cb1 \strokec5 .\cf6 \strokec6 print\cf5 \strokec5 (\cf7 \strokec7 "Enter the number of rows : "\cf5 \strokec5 );\cf0 \cb3 \strokec4 \
      my_input \cf8 \cb1 \strokec8 =\cf0 \cb3 \strokec4  my_scanner\cf5 \cb1 \strokec5 .\cf6 \strokec6 nextInt\cf5 \strokec5 ();\cf0 \cb3 \strokec4 \
      \cf6 \cb1 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 out\cf5 \cb1 \strokec5 .\cf6 \strokec6 println\cf5 \strokec5 (\cf7 \strokec7 "The pyramid star pattern : "\cf5 \strokec5 );\cf0 \cb3 \strokec4 \
      \cf2 \cb1 \strokec2 for\cf0 \cb3 \strokec4  \cf5 \cb1 \strokec5 (\cf0 \cb3 \strokec4 i\cf8 \cb1 \strokec8 =\cf9 \strokec9 0\cf5 \strokec5 ;\cf0 \cb3 \strokec4  i\cf8 \cb1 \strokec8 <\cf0 \cb3 \strokec4 my_input\cf5 \cb1 \strokec5 ;\cf0 \cb3 \strokec4  i\cf8 \cb1 \strokec8 ++\cf5 \strokec5 )\{\cf0 \cb3 \strokec4 \
        \cf2 \cb1 \strokec2 for\cf0 \cb3 \strokec4  \cf5 \cb1 \strokec5 (\cf0 \cb3 \strokec4 j\cf8 \cb1 \strokec8 =\cf0 \cb3 \strokec4 my_input\cf8 \cb1 \strokec8 -\cf0 \cb3 \strokec4 i\cf5 \cb1 \strokec5 ;\cf0 \cb3 \strokec4  j\cf8 \cb1 \strokec8 >\cf9 \strokec9 1\cf5 \strokec5 ;\cf0 \cb3 \strokec4  j\cf8 \cb1 \strokec8 --\cf5 \strokec5 )\{\cf0 \cb3 \strokec4 \
           \cf6 \cb1 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 out\cf5 \cb1 \strokec5 .\cf6 \strokec6 print\cf5 \strokec5 (\cf7 \strokec7 " "\cf5 \strokec5 );\cf0 \cb3 \strokec4 \
        \cf5 \cb1 \strokec5 \}\cf0 \cb3 \strokec4 \
        \cf2 \cb1 \strokec2 for\cf0 \cb3 \strokec4  \cf5 \cb1 \strokec5 (\cf0 \cb3 \strokec4 j\cf8 \cb1 \strokec8 =\cf9 \strokec9 0\cf5 \strokec5 ;\cf0 \cb3 \strokec4  j\cf8 \cb1 \strokec8 <=\cf0 \cb3 \strokec4 i\cf5 \cb1 \strokec5 ;\cf0 \cb3 \strokec4  j\cf8 \cb1 \strokec8 ++\cf0 \cb3 \strokec4  \cf5 \cb1 \strokec5 )\{\cf0 \cb3 \strokec4 \
           \cf6 \cb1 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 out\cf5 \cb1 \strokec5 .\cf6 \strokec6 print\cf5 \strokec5 (\cf7 \strokec7 "* "\cf5 \strokec5 );\cf0 \cb3 \strokec4 \
        \cf5 \cb1 \strokec5 \}\cf0 \cb3 \strokec4 \
        \cf6 \cb1 \strokec6 System\cf5 \strokec5 .\cf0 \cb3 \strokec4 out\cf5 \cb1 \strokec5 .\cf6 \strokec6 println\cf5 \strokec5 ();\cf0 \cb3 \strokec4 \
      \cf5 \cb1 \strokec5 \}\cf0 \cb3 \strokec4 \
   \cf5 \cb1 \strokec5 \}\cf0 \cb3 \strokec4 \
\pard\pardeftab720\partightenfactor0
\cf5 \cb1 \strokec5 \}}