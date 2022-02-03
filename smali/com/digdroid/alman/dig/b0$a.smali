.class Lcom/digdroid/alman/dig/b0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0;->u(Lcom/digdroid/alman/dig/x3;Landroid/database/Cursor;Landroid/database/Cursor;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/x3;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/database/Cursor;

.field final synthetic e:Landroid/database/Cursor;

.field final synthetic f:Lcom/digdroid/alman/dig/b0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0;Lcom/digdroid/alman/dig/x3;Ljava/lang/String;Landroid/database/Cursor;Landroid/database/Cursor;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$a;->f:Lcom/digdroid/alman/dig/b0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/b0$a;->b:Lcom/digdroid/alman/dig/x3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/digdroid/alman/dig/b0$a;->d:Landroid/database/Cursor;

    iput-object p5, p0, Lcom/digdroid/alman/dig/b0$a;->e:Landroid/database/Cursor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const-string p1, "android.intent.action.VIEW"

    :try_start_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/b0$a;->b:Lcom/digdroid/alman/dig/x3;

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "market://details?id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/b0$a;->b:Lcom/digdroid/alman/dig/x3;

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://play.google.com/store/apps/details?id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$a;->d:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$a;->e:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-void
.end method
