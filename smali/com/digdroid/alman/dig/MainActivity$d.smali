.class Lcom/digdroid/alman/dig/MainActivity$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$d;->c:Lcom/digdroid/alman/dig/MainActivity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/MainActivity$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string p2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p2, p0, Lcom/digdroid/alman/dig/MainActivity$d;->b:Ljava/lang/String;

    const-string v0, "package"

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p2, p0, Lcom/digdroid/alman/dig/MainActivity$d;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$d;->c:Lcom/digdroid/alman/dig/MainActivity;

    const-string p2, "retroarch"

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/a4;->F(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$d;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
