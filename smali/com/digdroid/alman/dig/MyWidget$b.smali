.class Lcom/digdroid/alman/dig/MyWidget$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MyWidget;->a(Landroid/app/Activity;JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:J

.field final synthetic d:Z

.field final synthetic e:Landroid/content/pm/ShortcutManager;


# direct methods
.method constructor <init>(Landroid/app/Activity;JZLandroid/content/pm/ShortcutManager;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->c:J

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/MyWidget$b;->d:Z

    iput-object p5, p0, Lcom/digdroid/alman/dig/MyWidget$b;->e:Landroid/content/pm/ShortcutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_7

    new-instance p1, Lcom/digdroid/alman/dig/k0;

    iget-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/MyWidget$b;->c:J

    invoke-direct {p1, p2, v0, v1}, Lcom/digdroid/alman/dig/k0;-><init>(Landroid/content/Context;J)V

    iget-boolean p2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->d:Z

    const-string v0, "com.digdroid.alman.LAUNCH_GAME"

    const/16 v1, 0x80

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/k0;->e()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/k0;->f(I)Landroid/graphics/Bitmap;

    move-result-object p2

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    const-class v3, Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p1, Lcom/digdroid/alman/dig/k0;->g:Ljava/lang/String;

    const-string v2, "system"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p1, Lcom/digdroid/alman/dig/k0;->i:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p1, Lcom/digdroid/alman/dig/k0;->i:Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/digdroid/alman/dig/k0;->a()Z

    move-result p2

    if-nez p2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/k0;->b(I)Landroid/graphics/Bitmap;

    move-result-object p2

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    const-class v3, Lcom/digdroid/alman/dig/WidgetActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->c:J

    const-string v0, "gameid"

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    iget-object v0, p1, Lcom/digdroid/alman/dig/k0;->j:Ljava/lang/String;

    :goto_0
    if-eqz p2, :cond_3

    invoke-static {p2}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "icon_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/digdroid/alman/dig/k0;->h:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "drawable"

    invoke-virtual {p2, p1, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "play"

    invoke-virtual {p2, v2, v3, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    :cond_4
    iget-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    invoke-static {p2, p1}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object p1

    :goto_1
    new-instance p2, Landroid/content/pm/ShortcutInfo$Builder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->b:Landroid/app/Activity;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "game"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/digdroid/alman/dig/MyWidget$b;->c:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v2, v3}, Landroid/content/pm/ShortcutInfo$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x6e

    const/4 v4, 0x0

    if-gt v2, v3, :cond_5

    move-object v2, v0

    goto :goto_2

    :cond_5
    const/16 v2, 0xa

    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {p2, v2}, Landroid/content/pm/ShortcutInfo$Builder;->setShortLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x7d

    if-gt v2, v3, :cond_6

    goto :goto_3

    :cond_6
    const/16 v2, 0x19

    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {p2, v0}, Landroid/content/pm/ShortcutInfo$Builder;->setLongLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/pm/ShortcutInfo$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setIntent(Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/pm/ShortcutInfo$Builder;->build()Landroid/content/pm/ShortcutInfo;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$b;->e:Landroid/content/pm/ShortcutManager;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/pm/ShortcutManager;->requestPinShortcut(Landroid/content/pm/ShortcutInfo;Landroid/content/IntentSender;)Z

    :cond_7
    return-void
.end method
