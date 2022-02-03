.class Lcom/digdroid/alman/dig/b0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0;->x(Landroid/app/Activity;JJZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lcom/digdroid/alman/dig/b0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0;ILandroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$a;->d:Lcom/digdroid/alman/dig/b0;

    iput p2, p0, Lcom/digdroid/alman/dig/b0$a;->b:I

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0$a;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget p1, p0, Lcom/digdroid/alman/dig/b0$a;->b:I

    invoke-static {p1}, Lcom/digdroid/alman/dig/y2;->y(I)V

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$a;->c:Landroid/app/Activity;

    iget-object p2, p0, Lcom/digdroid/alman/dig/b0$a;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {p2}, Lcom/digdroid/alman/dig/b0;->a(Lcom/digdroid/alman/dig/b0;)Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$a;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/y2;->w(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
