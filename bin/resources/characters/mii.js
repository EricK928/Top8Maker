var fs = require('fs');

let characters = ["Mii Brawler", "Mii Swordfighter", "Mii Gunner"];
//let idNames = ["mario", "donkey", "link", "samus", "samusd", "yoshi", "kirby", "fox", "pikachu", "luigi", "ness", "captain", "purin", "peach", "daisy", "koopa", "ice_climber", "sheik", "zelda", "mariod", "pichu", "falco", "marth", "lucina", "younglink", "ganon", "mewtwo", "roy", "chrom", "gamewatch", "metaknight", "pit", "pitb", "szerosuit", "wario", "snake", "ike", "ptrainer", "diddy", "lucas", "sonic", "dedede", "pikmin", "lucario", "robot", "toonlink", "wolf", "murabito", "rockman", "wiifit", "rosetta", "littlemac", "gekkouga", "palutena", "pacman", "reflet", "shulk", "koopajr", "duckhunt", "ryu", "ken", "cloud", "kamui", "bayonetta", "inkling", "ridley", "simon", "richter", "krool", "shizue", "gaogaen", "packun", "jack", "brave", "buddy", "dolly", "master", "tantan", "pickel", "edge", "eflame_only", "elight_only", "kazuya", "miifighter", "miiswordsman", "miigunner"];

for(var i=0; i<characters.length; i++)
{
	for(var j=1; j<=7; j++)
	{
		fs.copyFile(characters[i]+(j)+".png", characters[i]+(j+1)+".png", function(err)
		{
		    if ( err ) console.log('ERROR: ' + err);
		});
	}
}