.class Lcom/digdroid/alman/dig/s2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s2;->X0(ILjava/io/File;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/io/File;

.field final synthetic c:I

.field final synthetic d:Lcom/digdroid/alman/dig/s2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s2;Ljava/io/File;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s2$a;->d:Lcom/digdroid/alman/dig/s2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s2$a;->b:Ljava/io/File;

    iput p3, p0, Lcom/digdroid/alman/dig/s2$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const p2, 0x100c3

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p2, p0, Lcom/digdroid/alman/dig/s2$a;->b:Ljava/io/File;

    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    const-string v0, "android.provider.extra.INITIAL_URI"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p2, p0, Lcom/digdroid/alman/dig/s2$a;->d:Lcom/digdroid/alman/dig/s2;

    iget v0, p0, Lcom/digdroid/alman/dig/s2$a;->c:I

    invoke-virtual {p2, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
