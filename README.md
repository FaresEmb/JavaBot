###############################
EMBOUAZZA Fares & LEFEU Clement 
       T2 README JAVA
###############################


Fonctionnalités
---------------
Notre projet dispose de nombreuses fonctionnalités que nous allons vous détailler :
	-L'utilisateur dispose d'un nom d'utilisateur qu'il entre lors de l’exécution du programme. L'interaction avec cette utilisateur restera cohérent vis à vis de son nom d'utilisateur durant tout le long de l’exécution. 
	-L'utilisateur peux interagir avec le programme en y écrivant des mots. Le programme ne répond  aux messages de l’utilisateur seulement en cas d'appel précis que nous allons vous lister : 
		*/ @hello : appel le bot « Hello » répondant : « Salut <userName>! » 
		*/ @time : appel le bot « Time » répondant la date et  l'heure actuel. 
		*/ @icndb : appel le bot « Icndb » répondant en donnant une citation de Chuck Norris. Ce bot peut prendre un entier en argument correspondant aux nombres de citation qu'il va donner. Ce nombre max de citation est de 10, au-delà de cette limite, le bot n'affiche qu'une seule citation. (de nombreux cas d'exception ont été traité, afin de s'assurer de la validité de la demande (Exemple : s'assurer que l'argument est bien un entiers, …))
		*/ @quizz : appel le bot «Quizz» répondant à un appel en posant des question à l'utilisateur. Ce bot pose autant de question que l'utilisateur demande et en pose 1 par défaut lorsque cette argument n'est pas verifié. Ce bot est capable de donner le score total des bonnes réponse à la fin de son appel. Ces questions sont déterminée aléatoirement grâce à des appels vers une API dédié. 
		*/ @help : appel le bot «Help». Ce bot permet lors de son appel, d'afficher tous les bots disponibles. Cela permet à l'utilisateur d'obtenir toutes les informations sur les interactions possibles entre bots.
	-L'utilisateur a accès à une interface afin d’interagir avec les bots. Cette interface s'ouvre immédiatement au lancement du programme. Cette interface est dynamique, elle affiche les messages dans un ordre antichronologique et en commençant par le bas. Les messages défilent vers le haut. (Nous avons pris en compte les cas limites, tel que lorsque l'interface est pleinement rempli de message, les plus ancien se voit supprimés). 
	-L'utilisateur peux faire appel à certains bot qui interagissent avec cette interface:
		*/ @delete :  appel le bot «Delete». Ce bot permet lors de son appel, de supprimer le dernière appel de l'utilisateur ainsi que toutes les réponses suivantes données par le bot. 
		*/ @rename : appel le bot «Rename». Ce bot permet de changer de nom d'utilisateur. 
		*/ @clear : appel le bot «Clean». Ce bot permet de nettoyer toute l'interface. Autrement dit, il remet l'interface à zéro en supprimant tous les messages ultérieurement écrit.



La structure du programme a été pensé afin de pouvoir faciliter tout ajout de bot. Nous avons fait le choix d'une architecture dite "Model View Controller" constitué de trois parties distinctes; Le model qui contient les données à afficher, une vue contenant la présentation de l'interface graphique et enfin, un contrôleur contenant les actions effectuées par l'utilisateur. Ce processus permet d'organiser au mieux notre programme avec pour chaque partie des rôles et taches précises.



Architecture
------------
src/Main.java : Il s'agit du premiers programme lancé. Il permet une vérification des arguments donnés, à savoir, "-p <userName>" et informe l'utilisateur en cas d'erreur. Il créer un UserController puis lance sa méthode runUser permettant d'initier le programme. 


src/model/Bot.java : Il s'agit du modèle général des bots. Tous les bots découlent de cette structure (Ils héritent tous de Bot). 
src/model/HelloBot.java : Cette classe est le modèle du Bot Hello.
src/model/HelpBot.java : Cette classe est le modèle du Bot Help.
src/model/RenameBot.java : Cette classe est le modèle du Bot Rename.
src/model/IcndbBot.java : Cette classe est le modèle du Bot Icndb.
src/model/JsonModel.java : Cette permet d'établir une connexion avec une API en y récupérant le JSON lié.
src/model/QuizzBot.java : Cette classe est le modèle du Bot Quizz.
src/model/SystemBot.java : Cette classe est le modèle du Bot System.
src/model/TimeBot.java : Cette classe est le modèle du Bot Time.
src/model/User.java : Cette classe est le modèle de l'utilisateur, l'argument est le nom.

src/view/Terminal.java : Cette classe permet d'établir la liaison vers l'interface. Elle hérite donc de cette dernière. 
src/view/Windows.java : Cette classe gère l'affichage et les modifications de l'intérface.

src/controller/BotController.java : Le BotController est le contrôleur commun à tous les bots, il permet de lancer la méthode launch directement.
src/controller/DeleteController.java : Le DeleteController sert de contrôleur lorsque l'utilisateur appelle le bot Delete.
src/controller/ClearController.java : Le ClearController sert de contrôleur lorsque l'utilisateur appelle le bot Clear.
src/controller/HelloController.java : Le HelloController sert de contrôleur lorsque l'utilisateur appelle le bot Hello.
src/controller/HelpController.java : Le HelpController sert de contrôleur lorsque l'utilisateur appelle le bot Help.
src/controller/IcndbController.java : Le IcndbController sert de contrôleur lorsque l'utilisateur appelle le bot Icndb.
src/controller/LaunchController.java : Le LaunchController contrôle la création du Hashmap lié aux bots. Il initie et lance les bots.
src/controller/QuizzController.java : Le QuizzController sert de contrôleur lorsque l'utilisateur appelle le bot Quizz.
src/controller/RenameController.java : Le RenameController sert de contrôleur lorsque l'utilisateur appelle le bot Rename.
src/controller/SystemController.java : Le SystemController contrôle l’interaction avec le bot System qui intervient lorsque le bot appelé est inconnu.
src/controller/TimeController.java : Le TimeController sert de contrôleur lorsque l'utilisateur appelle le bot Time.
src/controller/UserController.java : Le UserController contrôle l’interaction entre l'affichage et l'utilisateur.

...