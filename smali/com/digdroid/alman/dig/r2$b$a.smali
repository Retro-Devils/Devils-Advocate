.class Lcom/digdroid/alman/dig/r2$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$b;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r2$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$b$a;->b:Lcom/digdroid/alman/dig/r2$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    new-instance p1, Lcom/digdroid/alman/dig/r2$b$a$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/r2$b$a$a;-><init>(Lcom/digdroid/alman/dig/r2$b$a;)V

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
