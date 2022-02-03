.class Lcom/digdroid/alman/dig/r2$a0$a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$a0$a;->a([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r2$a0$a$b;

.field final synthetic c:Lcom/digdroid/alman/dig/r2$a0$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$a0$a;Lcom/digdroid/alman/dig/r2$a0$a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$a0$a$c;->c:Lcom/digdroid/alman/dig/r2$a0$a;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$a0$a$c;->b:Lcom/digdroid/alman/dig/r2$a0$a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$a0$a$c;->b:Lcom/digdroid/alman/dig/r2$a0$a$b;

    iput p2, p1, Lcom/digdroid/alman/dig/r2$a0$a$b;->a:I

    return-void
.end method
